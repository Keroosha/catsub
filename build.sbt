name := "catsub"
maintainer := "zawodskoj"

version := "0.1"

scalaVersion := "2.13.6"
scalacOptions += "-Ymacro-annotations"

addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full)
addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")

libraryDependencies += "com.softwaremill.sttp.client3" %% "core" % "3.3.9"
libraryDependencies += "com.softwaremill.sttp.client3" %% "async-http-client-backend-fs2-ce2" % "3.3.9"
libraryDependencies += "com.softwaremill.sttp.client3" %% "circe" % "3.3.9"
libraryDependencies += "tf.tofu" %% "derevo-core" % "0.12.6"
libraryDependencies += "tf.tofu" %% "derevo-circe" % "0.12.6"
libraryDependencies += "io.github.humbleui" % "skija-linux" % "0.100.0"

enablePlugins(JavaAppPackaging)
enablePlugins(JDebPackaging)
enablePlugins(DebianPlugin)