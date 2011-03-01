package com.citrix.pong {
  package model {

    import _root_.net.liftweb.mapper._
    import _root_.net.liftweb.util._
    import _root_.net.liftweb.common._

    object GameResults extends GameResults with LongKeyedMetaMapper[GameResults] {
      override def dbTableName = "gameResults"
      override def fieldOrder = List (player, outcome, newRating)
    }

    class GameResults extends LongKeyedMapper[GameResults] with IdPK {
      def getSingleton = GameResults
      object player extends MappedLongForeignKey(this, Player)
      object outcome extends MappedDouble(this)
      object newRating extends MappedInt(this)
    }

  }
}
