package io.mehitabel.rekord.project

import sbt._

object Dependencies {
  import Grouping._
  object Version {
    val cats = "0.9.0"
    val scalatest = "3.0.1"
    val scalacheck = "1.13.4"
  }

  lazy val rekord = {cats ++ test}

  object Grouping {
    val cats = Seq(
      "org.typelevel" %% "cats" % Version.cats
    )
    val test = Seq(
      "org.scalatest"  %% "scalatest"  % Version.scalatest,
      "org.scalacheck" %% "scalacheck" % Version.scalacheck
    ).map(_ % Test)
  }
}
