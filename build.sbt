name := "preneur-erp"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)

lazy val root = (project in file("."))