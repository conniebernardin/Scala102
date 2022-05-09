package Practicals

object DogOptions extends App {

  case class Dog(name: String,
                 breed: String,
                 age: Int,
                 spotColour: Option[String],
                 faveToy: Option[String],
                 barks: Option[Boolean])

  def whatColourSpots(dog: Dog): String = {
    dog.spotColour match {
      case Some(input) => input
      case None => s"${dog.name} has no spots"
    }
  }

  def whichFaveToy(dog: Dog): String = {
    dog.faveToy match {
      case Some("balls") => s"${dog.name} loves playing catch with balls"
      case Some("rope") => s"${dog.name} loves playing tug-of-war with rope"
      case Some("bags") => s"${dog.name} loves being carried around in bags"
      case Some(input) => input
      case None => s"${dog.name} doesn't have a favourite toy"
    }
  }

  def doTheyBark(dog: Dog): String ={
    dog.barks match {
      case Some(true) => s"${dog.name} is a barker!"
      case Some(false) => s"${dog.name} is a quiet one!"
      case None => s"${dog.name} makes an average amount of noise"
    }
  }

  val baloo = Dog("baloo", "Working Cockaspaniel", 10, Some("Black"), None, Some(false))
  val moose = Dog("moose", "Cockapoo", 4, None, Some("bags"), Some(true))

  println(whatColourSpots(baloo))
  println(whatColourSpots(moose))

  println(whichFaveToy(baloo))
  println(whichFaveToy(moose))

  println(doTheyBark(baloo))
  println(doTheyBark(moose))

}
