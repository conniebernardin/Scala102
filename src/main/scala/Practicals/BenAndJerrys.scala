package Practicals

/*Accept a string for a general flavour and returns a different ben and jerry's flavour for each one:
Caramel = caramel chew chew, Chocolate = chocolate fudge brownie, Cookie = cookie dough,
anything else return original flavour
 */

object BenAndJerrys extends App {

  def Flavour(flavour: String): String = {
    flavour match {
    case "Chocolate" => "chocolate fudge brownie"
    case "Caramel" => "caramel chew chew"
    case "Cookie" => "cookie dough"
    case "Marshmallow" => "Baked Alaska"
    case _ => flavour
  }}


  println(Flavour("Cookie"))

}
