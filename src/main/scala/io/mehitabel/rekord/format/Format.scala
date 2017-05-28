package io.mehitabel.rekord
package format
import cats.data.{NonEmptyList => NEL, _}

trait Format[T] {
  def format(f: T): Validated[NEL[String], Output[String]]
}
