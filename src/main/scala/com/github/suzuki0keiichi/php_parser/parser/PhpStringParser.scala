package com.github.suzuki0keiichi.php_parser.parser

import scala.util.parsing.combinator.RegexParsers
import com.github.suzuki0keiichi.php_parser.tree.expression.{StringLiteral, Expression}

/**
 * PHPの文字列内の構文解析をする
 * まだ何もしていない
 */
object PhpStringParser extends RegexParsers {
  lazy val all = ".*".r ^^ {
    StringLiteral(_, false)
  }

  def parse(string: String): Expression = parseAll(all, string) match {
    case Success(result, _) =>
      result

    case failure: NoSuccess =>
      println(failure)
      StringLiteral(string, false)
  }
}
