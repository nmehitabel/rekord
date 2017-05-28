import sbt.Keys._
import io.mehitabel.rekord.project._
import io.mehitabel.rekord.project.ProjectSettings._

lazy val rootSettings = Seq(
  organization := "io.mehitabel",
  scalaVersion := "2.12.2",
  git.useGitDescribe := true,
  crossScalaVersions := "2.12.2" :: "2.11.8" :: Nil,
  scalacOptions := commonScalacOptions
) ++ warnUnusedImport

lazy val rekord = (project in file("."))
  .enablePlugins(GitVersioning)
  .settings(rootSettings: _*)
  .settings(name := "rekord")
  .settings(libraryDependencies ++= Dependencies.rekord)

  
