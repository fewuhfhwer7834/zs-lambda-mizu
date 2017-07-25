lazy val root = (project in file(".")).
  settings(
    name := "Hello",
    version := "0.0.1",
    scalaVersion := "2.11.8",
    inThisBuild(List(
      organization := "com.mizu",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    libraryDependencies ++= Seq(
      "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test",
      "com.amazonaws" % "aws-lambda-java-events" % "1.3.0",
      "com.amazonaws" % "aws-lambda-java-core" % "1.1.0"
    )
  )
