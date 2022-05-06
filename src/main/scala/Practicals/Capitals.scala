package Practicals

object Capitals extends App {
/*Create a function that takes a String and returns a capitalised version
of the String if it is a capital city of the UK, or “<String> isn’t a UK capital”
if it isn’t (we mean London, Edinburgh, Cardiff and Belfast)
*/

  def cityCapitaliser(city: String): String = {
    city.toLowerCase() match {
      case "london" => city.toUpperCase()
      case "Cardiff" => city.toUpperCase()
      case "Edinburgh" => city.toUpperCase()
      case "belfast" => city.toUpperCase()
      case _ => s"${city.toUpperCase()} isn't a UK capital"
    }
  }
  println(cityCapitaliser("london"))
  println(cityCapitaliser("manchester"))
}
