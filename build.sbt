lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "protobuf",
    libraryDependencies ++= Seq(
       "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
    ),
    PB.targets in (Compile) := Seq(
       scalapb.gen() -> (sourceManaged in Compile).value
    )
  )
