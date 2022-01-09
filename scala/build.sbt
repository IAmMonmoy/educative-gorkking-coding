import Dependencies._
// The simplest possible sbt build file is just one line:

lazy val baseSettings: Seq[Setting[_]] = Seq(
  organization := "rajob.raihan",
  scalaVersion := "2.13.6",
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding",
    "UTF-8",
    "-feature",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:existentials",
    "-language:postfixOps",
    "-unchecked",
    "-Ywarn-value-discard",
  ),
  libraryDependencies ++= Seq(
    scalatest,
  )
)

lazy val foundation = project
  .in(file("."))
  .settings(moduleName := "educative")
  .settings(version := "1.0")
  .settings(baseSettings: _*)
