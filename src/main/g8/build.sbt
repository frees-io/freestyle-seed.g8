lazy val freesV = "$freesVersion$"

lazy val `$project$` = project
  .in(file("."))
  .settings(name := "$project$")
  .settings(moduleName := "$project$")
  .settings(description := "$projectDescription$")
  .settings(
    addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full),
    libraryDependencies ++= Seq(
      "io.frees" %% "frees-core" % freesV,
      "org.scalameta" %% "scalameta" % "1.8.0"
    ),
    scalacOptions += "-Xplugin-require:macroparadise",
    scalacOptions in (Compile, console) ~= (_ filterNot (_ contains "paradise")) // macroparadise plugin doesn't work in repl yet.
  )
