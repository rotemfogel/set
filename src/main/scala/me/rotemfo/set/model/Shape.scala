package me.rotemfo.set.model

import scala.util.Random

sealed trait Shape

object Shape {
  val values: Array[Shape] = Array(Diamond, Squiggle, Oval)

  def random: Shape = {
    values(Random.nextInt(3))
  }

  case object Diamond extends Shape

  case object Squiggle extends Shape

  case object Oval extends Shape

}
