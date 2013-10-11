package com.github.suzuki0keiichi.php_parser.tree

trait Tree {
  def phpCode: List[String]

  override def toString() = phpCode.mkString("\n")
}
