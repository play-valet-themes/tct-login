name := """tc-login"""

version := "0.0.1"

scalaVersion in ThisBuild := "2.11.8"

libraryDependencies ++= Seq(
  cache,
  ws,
  filters,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

CoffeeScriptKeys.sourceMap := false

LessKeys.compress in Assets := true

includeFilter in(Assets, LessKeys.less) := "*.less"

includeFilter in gzip := "*.js"

pipelineStages := Seq(gzip)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
