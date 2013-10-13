package com.github.suzuki0keiichi.php_parser.parser

import scala.util.parsing.combinator.RegexParsers
import com.github.suzuki0keiichi.php_parser.tree.expression._
import com.github.suzuki0keiichi.php_parser.tree.statement.Statement
import com.github.suzuki0keiichi.php_parser.Tokens
import com.github.suzuki0keiichi.php_parser.tree.statement.Line
import com.github.suzuki0keiichi.php_parser.tree.expression.BooleanLiteral
import com.github.suzuki0keiichi.php_parser.statement.ElseIf
import com.github.suzuki0keiichi.php_parser.tree.expression.FunctionCall
import com.github.suzuki0keiichi.php_parser.tree.expression.VariableRef
import com.github.suzuki0keiichi.php_parser.statement.If
import scala.util.parsing.input.PagedSeqReader
import scala.collection.immutable.PagedSeq
import scala.io.Source

object PhpCodeParser extends RegexParsers {

  import Tokens._

  lazy val booleanLiteral = "(true|false)".r ^^ {
    case "true" => BooleanLiteral(true)
    case "false" => BooleanLiteral(false)
  }

  lazy val stringLiteral1 = T_CONSTANT_ENCAPSED_STRING1.r ^^ {
    res => PhpStringParser.parse(res.substring(1, res.length - 1))
  }

  lazy val stringLiteral2 = T_CONSTANT_ENCAPSED_STRING2.r ^^ {
    res => PhpStringParser.parse(res.substring(3, res.length - 3))
  }

  lazy val literal = booleanLiteral | stringLiteral1

  lazy val variableRef = T_VARIABLE.r ^^ {
    res =>
      println(res)
      VariableRef(res)
  }

  lazy val functionCall: Parser[Expression] = T_STRING.r ~ ("(" ~> repsep(expression, ",") <~ ")") ^^ {
    case name ~ params => FunctionCall(name, params)
  }

  lazy val expression: Parser[Expression] = variableRef | literal | functionCall

  lazy val line: Parser[Statement] = expression <~ ";" ^^ (Line(_))

  lazy val blockStatement: Parser[Statement] = "{" ~> statement <~ "}"

  lazy val statement: Parser[Statement] = ifStatement | blockStatement | line

  lazy val statements: Parser[List[Statement]] = rep(statement)

  lazy val ifStatement: Parser[Statement] = (T_IF ~> "(" ~> expression <~ ")") ~ ("{" ~> statements <~ "}") ~ rep(elseIfStatement) ~ opt(elseStatement) ^^ {
    case expression ~ statements ~ elseIfStatements ~ elseStatement =>
      If(expression, statements, elseIfStatements, elseStatement)
  }

  lazy val elseIfStatement: Parser[ElseIf] = (T_ELSEIF ~> "(" ~> expression <~ ")") ~ ("{" ~> statements <~ "}") ^^ {
    case expression ~ statements => ElseIf(expression, statements)
  }

  lazy val elseStatement: Parser[List[Statement]] = T_ELSE ~> "{" ~> statements <~ "}"

  lazy val all = T_OPEN_TAG.r ~> statements <~ opt(T_CLOSE_TAG)

  def parse(source: Source): Option[List[Statement]] = parse(new PagedSeqReader(PagedSeq.fromSource(source)))

  def parse(reader: scala.util.parsing.input.Reader[Char]): Option[List[Statement]] = parseAll(all, reader) match {
    case Success(result, _) =>
      Some(result)

    case failure: NoSuccess =>
      println(failure)
      None
  }
}