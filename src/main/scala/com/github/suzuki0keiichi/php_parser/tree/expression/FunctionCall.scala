package com.github.suzuki0keiichi.php_parser.tree.expression

case class FunctionCall(name: String, params: List[Expression]) extends Expression {
  def phpCode = List(name + "(" + params.map(_.phpCode).mkString(", ") + ")")
}
