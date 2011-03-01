package com.citrix.pong {
  package model {

    import _root_.net.liftweb.mapper._
    import _root_.net.liftweb.util._
    import _root_.net.liftweb.common._

    object GamesPlayed extends GamesPlayed with LongKeyedMetaMapper[GamesPlayed] {
      override def dbTableName = "gamesPlayed"
      override def fieldOrder = List (date, gameType)
    }

    class GamesPlayed extends LongKeyedMapper[GamesPlayed] with IdPK {
      def getSingleton = GamesPlayed
      object date extends MappedDateTime(this)
      object gameType extends MappedLongForeignKey(this, GameTypes)
    }

  }
}
