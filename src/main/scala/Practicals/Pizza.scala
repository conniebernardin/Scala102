package Practicals

object Pizza extends App {

def PizzaCalculator(size: Int): String = {
  size match{
    case 7 => "personal"
    case 9 => "small"
    case 11 => "medium"
    case 13 => "large"
    case _ => "no size found. default to medium 12 inch"
  }
}

  println(PizzaCalculator(13))

  //USING TRAITS AND CASE CLASSES
  case class Pizza(size: Int, isStuffed: Boolean) extends Stuffed

  trait Stuffed

//  var cost = 0

  def customerOrder(size: Int, isStuffed: Boolean): Unit = {

  size match {
    case 7 if isStuffed => val cost = (5.99 + 2.99)
      println(s"personal stuffed crust pizza costing $cost")
    case 7 => val cost = 5.99
      println(s"personal pizza costing $cost")
    case 9 if isStuffed => val cost = (10.99 + 2.99)
      println(s"small stuffed crust pizza costing $cost")
    case 9 => val cost = 10.99
      println(s"small pizza costing $cost")
    case 11 if isStuffed => val cost = (12.99 + 2.99)
      println("medium stuffed crust pizza costing $cost")
    case 11 => val cost = 12.99
      println(s"medium pizza costing $cost")
    case 13 if isStuffed => val cost = (14.99 + 2.99)
      println(s"large stuffed crust pizza costing $cost")
    case 13 => val cost = 14.99
      println(s"large pizza costing $cost")
    case _ => val cost = 12.99
      println(s"default medium pizza costing $cost")

  }

  }

  customerOrder(9, isStuffed = true)

}
