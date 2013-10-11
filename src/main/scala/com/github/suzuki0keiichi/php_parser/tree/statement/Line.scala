package com.github.suzuki0keiichi.php_parser.tree.statement

import com.github.suzuki0keiichi.php_parser.tree.expression.Expression

case class Line(expression: Expression) extends Statement {
  def phpCode = expression.phpCode ::: List(";")
}
