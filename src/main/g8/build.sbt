addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M8" cross CrossVersion.full)

lazy val root = project
  .in(file("."))
  .settings(name := "$project$")
  .settings(moduleName := "root")
  .aggregate(`$project$JS`, `$project$JVM`)
  .settings(Seq(
    libraryDependencies ++= Seq("io.frees" %%% "freestyle" % "0.3.0")): _*)

lazy val `$project$` = crossProject
  .in(file("$project$"))
  .settings(moduleName := "$project$")
  .jsSettings(sharedJsSettings: _*)

lazy val `$project$JVM` = `$project$`.jvm
lazy val `$project$JS` = `$project$`.js
