package com.citrix.pong {
  package model {

    import _root_.net.liftweb.mapper._
    import _root_.net.liftweb.util._
    import _root_.net.liftweb.common._

    object GameTypes extends GameTypes with LongKeyedMetaMapper[GameTypes] {
      override def dbTableName = "gameTypes"
      override def fieldOrder = List(name)
    }

    class GameTypes extends LongKeyedMapper[GameTypes] with IdPK {
      def getSingleton = GameTypes
      object name extends MappedString(this, 40)
    }

  }
}
