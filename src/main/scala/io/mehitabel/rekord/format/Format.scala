package io.mehitabel.rekord
package format
import cats.data.{NonEmptyList => NEL, _}

trait Formatted[T] {
  def format(value: T): Validated[NEL[String], Output[String]]

  def contramap[S](f: S => T): Formatted[S] = {
    val self = this
    new Formatted[S] {
      def format(value: S): Validated[NEL[String], Output[String]] =
        self.format(f(value))
    }
  }
}
