package com.github.suzuki0keiichi.php_parser.statement

import com.github.suzuki0keiichi.php_parser.tree.statement.Statement
import com.github.suzuki0keiichi.php_parser.tree.expression.Expression

case class If(cond: Expression, statement: Statement) extends Statement {

}
