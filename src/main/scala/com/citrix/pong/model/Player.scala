package com.citrix.pong {
  package model {

    import _root_.net.liftweb.mapper._
    import _root_.net.liftweb.util._
    import _root_.net.liftweb.common._

    /**
     * The singleton that has methods for accessing the database
     */
    object Player extends Player with MetaMegaProtoUser[Player] {
      override def dbTableName = "players" // define the DB table name
      override def screenWrap = Full(<lift:surround with="default" at="content">
                                     <lift:bind /></lift:surround>)
      // define the order fields will appear in forms and output
      override def fieldOrder = List(id, firstName, lastName, displayName,
                                     email, password)
                                     //(id, playerName, email, password)

      // comment this line out to require email validations
      override def skipEmailValidation = true

      //override def lostPasswordMenuLoc = Empty
    }

    /**
     * An O-R mapped "User" class that includes first name, last name, password and we add a "Personal Essay" to it
     */
    class Player extends MegaProtoUser[Player] {
      def getSingleton = Player // what's the "meta" server

      // define an additional field for a custom display name
      object displayName extends MappedString(this, 80) {}

      // define an additional field for a player's  Elo rating
      //object rating extends MappedInt(this) {}
    }
  }

}
