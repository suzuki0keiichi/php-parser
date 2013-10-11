package com.github.suzuki0keiichi.php_parser.tree.expression

case class VariableRef(name: String) extends Expression {
  def phpCode = List("$" + name)
}
