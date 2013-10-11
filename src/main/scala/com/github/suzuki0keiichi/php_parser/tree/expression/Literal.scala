package com.github.suzuki0keiichi.php_parser.tree.expression

trait Literal extends Expression

case class StringLiteral(text: String, hereDocument: Boolean) extends Literal {
  def phpCode = if (hereDocument) {
    List("\"\"\"" + text + "\"\"\"")
  } else {
    List("\"" + text + "\"")
  }
}

case class NumberLiteral(num: String) extends Literal {
  def phpCode = List(num)
}

case class BooleanLiteral(value: Boolean) extends Literal {
  def phpCode = List(value.toString)
}