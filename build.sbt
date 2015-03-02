name := "config-annotation-example"

version := "1.0"

organization := "com.wacai"

scalaVersion := "2.11.5"

libraryDependencies += "com.wacai" %% "config-annotation" % "0.3.1"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)

unmanagedClasspath in Runtime += baseDirectory.value / "conf"

scalacOptions += s"-Xmacro-settings:conf.output.dir=${baseDirectory.value / "conf"}"


    
