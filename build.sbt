name := "activator-seed"
organization := "com.example"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.8"

fork in run := true

javaOptions ++= Seq(
  "-Dlog.service.output=/dev/stderr",
  "-Dlog.access.output=/dev/stderr")

lazy val versions = new {
  val finatra = "2.9.0"
  val guice = "4.0"
  val logback = "1.0.13"
  val mockito = "1.9.5"
  val scalatest = "2.2.3"
  val specs2 = "2.3.12"
}

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % versions.finatra,
  "com.twitter" %% "inject-server" % versions.finatra % "test",
  "com.twitter" %% "inject-app" % versions.finatra % "test",
  "com.twitter" %% "inject-core" % versions.finatra % "test",
  "com.twitter" %% "inject-modules" % versions.finatra % "test",
  "com.google.inject.extensions" % "guice-testlib" % versions.guice % "test",
  "com.twitter" %% "finatra-http" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-server" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-app" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-core" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-modules" % versions.finatra % "test" classifier "tests",
  "org.mockito" % "mockito-core" % versions.mockito % "test",
  "org.scalatest" %% "scalatest" % versions.scalatest % "test",
  "org.specs2" %% "specs2" % versions.specs2 % "test")
