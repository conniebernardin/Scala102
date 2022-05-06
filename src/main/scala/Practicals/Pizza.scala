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

}
