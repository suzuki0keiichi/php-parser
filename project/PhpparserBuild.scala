import sbt._
import sbt.Keys._

object PhpparserBuild extends Build {

  lazy val phpparser = Project(
    id = "php-parser",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "php-parser",
      organization := "com.github.suzuki0keiichi",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2"
      // add other settings here
    )
  )
}
