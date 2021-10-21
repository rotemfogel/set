package me.rotemfo.set.game

import me.rotemfo.set.model._

import scala.collection.mutable
import scala.util.Random

object Deck {
  private lazy val random = Random
  private lazy val deck: mutable.Queue[Card] = {
    val cardsList = Color.values.flatMap(color => {
      Shape.values.flatMap(shape => {
        Shading.values.flatMap(shading => {
          NumberOfShapes.values.map(number => {
            Card(shape, number, shading, color)
          })
        })
      })
    }).toList
    mutable.Queue(random.shuffle(cardsList): _*)
  }

  @throws[EmptyDeckException]
  def draw(): Card = {
    if (deck.isEmpty) throw EmptyDeckException()
    deck.dequeue
  }

}
