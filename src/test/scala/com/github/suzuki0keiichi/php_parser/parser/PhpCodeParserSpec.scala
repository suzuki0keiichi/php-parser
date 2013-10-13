package com.github.suzuki0keiichi.php_parser.parser

import scala.io.Source
import org.scalatest.{Matchers, FlatSpec}
import com.github.suzuki0keiichi.php_parser.tree.expression.{StringLiteral, FunctionCall, BooleanLiteral}
import com.github.suzuki0keiichi.php_parser.statement.If
import com.github.suzuki0keiichi.php_parser.tree.statement.Line

class PhpCodeParserSpec extends FlatSpec with Matchers {
  it should "大カッコつきのif文をサポートする" in {
    parseFromResource("if.php") should equal(Some(List(If(
      BooleanLiteral(true),
      List(Line(FunctionCall("println", List(StringLiteral("hoge", false))))),
      Nil, None))))
  }

  it should "ダブルクォートのエスケープにも対応" in {
    parseFromResource("escaped_string.php") should equal(Some(List(If(
      BooleanLiteral(true),
      List(Line(FunctionCall("println", List(StringLiteral("hoge\\\"wa--", false))))),
      Nil, None))))
  }

  def parseFromResource(name: String) = PhpCodeParser.parse(Source.fromInputStream(getClass.getResourceAsStream(name)))
}