name := "Spec2"

version := "1.0"

scalaVersion := "2.10.0"

libraryDependencies += "org.specs2" % "specs2_2.10" % "1.14"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

libraryDependencies += "commons-lang" % "commons-lang" % "2.6"

mainClass in oneJar := Some("specs2.run")