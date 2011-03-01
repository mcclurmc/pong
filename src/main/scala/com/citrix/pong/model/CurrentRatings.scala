package com.citrix.pong {
  package model {

    import _root_.net.liftweb.mapper._
    import _root_.net.liftweb.util._
    import _root_.net.liftweb.common._

    object CurrentRatings extends CurrentRatings with LongKeyedMetaMapper[CurrentRatings] {
      override def dbTableName = "currentRatings"
      override def fieldOrder = List (player, gameType, rating)
    }

    class CurrentRatings extends LongKeyedMapper[CurrentRatings] with IdPK {
      def getSingleton = CurrentRatings

      object player extends MappedLongForeignKey(this, Player)
      object gameType extends MappedLongForeignKey(this, GameTypes)
      object rating extends MappedDouble(this)
    }

  }
}
