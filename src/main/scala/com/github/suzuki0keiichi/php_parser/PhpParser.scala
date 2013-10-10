package com.github.suzuki0keiichi.php_parser

import scala.util.parsing.combinator.RegexParsers
import Tokens

object PhpParser extends RegexParsers {
  import Tokens._

  lazy val expression = ""
  lazy val statements = ""
  lazy val blockStatement = "{" ~ statements ~ "}"
  lazy val ifStatement = T_IF ~ "(" ~> expression <~ ")" ~ "{" ~ statements ~ "}" ~ rep(elseIfStatement) ~ opt(elseStatement)
  lazy val elseIfStatement = T_ELSEIF ~ "{" ~ statements ~ "}"
  lazy val elseStatement = T_ELSE ~ "{" ~ statements ~ "}"
}
