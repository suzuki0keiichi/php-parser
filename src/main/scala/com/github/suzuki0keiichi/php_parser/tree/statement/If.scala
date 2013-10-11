package com.github.suzuki0keiichi.php_parser.statement

import com.github.suzuki0keiichi.php_parser.tree.statement.Statement
import com.github.suzuki0keiichi.php_parser.tree.expression.Expression

case class If(cond: Expression, statements: List[Statement], elseIfStatements: List[ElseIf], elseStatement: Option[List[Statement]]) extends Statement {
  def phpCode = ("if (" + cond.phpCode.mkString(" ") + ") {") ::
    statements.flatMap(_.phpCode.map("  " + _)) :::
    ("}" :: elseIfStatements.flatMap(_.phpCode)) ::: elseStatement.map(_.flatMap(_.phpCode)).getOrElse(Nil)
}

case class ElseIf(cond: Expression, statements: List[Statement]) {
  def phpCode = ("elseif (" + cond.phpCode.mkString(" ") + ") {") :: statements.flatMap(_.phpCode.map("  " + _)) ::: List("}")
}