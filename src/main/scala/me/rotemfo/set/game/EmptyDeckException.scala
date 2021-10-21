package me.rotemfo.set.game

final case class EmptyDeckException(private val cause: Throwable = None.orNull)
  extends Exception("Deck is empty", cause)
