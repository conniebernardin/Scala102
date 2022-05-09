package Practicals

object Options extends App {

  case class Chocolate (name: String, filling: Option[String])

  //Options Matching
  def whatsInTheChoc(chocolate: Chocolate): String = {
    chocolate.filling match {
      case Some("caramel") => "It’s caramel!"
      case Some(other) => "No caramel, but $other"
      case None => "It’s chocolate all the way down!"
    }
  }

  //Options Chocolate Practical


  def fillingCheck (chocolate: Chocolate): String = {
    chocolate.filling match {
      case Some(value) => value
      case None => "no filling"
    }
  }

    val Snicker = Chocolate ("Snicker", Some("Peanuts"))
    val Bourneville = Chocolate("Bourneville", None)
    val Mars = Chocolate("Mars", Some("Caramel and Nougat"))

  println(fillingCheck(Snicker)) //returns peanuts
  println(fillingCheck(Bourneville)) //returns "no filling"
  println(fillingCheck(Mars)) //returns "Caramel and Nougat"
}
