package com.github.suzuki0keiichi.php_parser

import scala.util.parsing.combinator.RegexParsers
import scala.io.Source
import com.github.suzuki0keiichi.php_parser.tree.expression._
import com.github.suzuki0keiichi.php_parser.tree.statement.{Line, Statement}
import com.github.suzuki0keiichi.php_parser.statement.{ElseIf, If}
import com.github.suzuki0keiichi.php_parser.tree.expression.StringLiteral
import com.github.suzuki0keiichi.php_parser.tree.expression.BooleanLiteral
import com.github.suzuki0keiichi.php_parser.tree.expression.VariableRef

object PhpParser extends RegexParsers {

  import Tokens._

  lazy val booleanLiteral = "(true|false)".r ^^ {
    case "true" => BooleanLiteral(true)
    case "false" => BooleanLiteral(false)
  }

  lazy val stringLiteral1 = (T_CONSTANT_ENCAPSED_STRING1 + ".*" + T_CONSTANT_ENCAPSED_STRING1).r ^^ {
    StringLiteral(_, false)
  }

  lazy val stringLiteral2 = (T_CONSTANT_ENCAPSED_STRING2 + ".*" + T_CONSTANT_ENCAPSED_STRING2).r ^^ {
    StringLiteral(_, true)
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

  def parse(source: String) = parseAll(all, source) match {
    case Success(result, _) => result
    case failure: NoSuccess => println(failure)
  }
}

object TestMain {
  def main(args: Array[String]) {
    val phpSource =
      """<?php
        if (true) {
          println("hoge");
        }
      """
    println(PhpParser.parse(phpSource))
  }
}