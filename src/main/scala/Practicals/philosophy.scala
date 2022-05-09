package Practicals
import scala.util.Random

object philosophy extends App {


  val philosophyQuotes = List(
    "Live Laugh Love",
    "Dance as if no one is watching",
    "YOLO",
    "If life gives you lemons, make lemonade",
    "You have to look through the rain to see the rainbow",
    "Yesterday is history, tomorrow a mystery and today is a gift... that is why it is called the present",
    "Man is born free, but is everywhere in chains", "The unexamined life is not worth living",
    "I think therefore I am",
    "To be is to be perceived",
    "Eat. Sleep. Rave. Repeat"
  )

//  accepts an optional quote to return. If no quote is supplied return a random (use scala.util.Random) philosophy quote.
  val getExistential: (Option[String]) => String = quote => quote match {
    case Some(input) => input
    case None => philosophyQuotes(Random.nextInt(philosophyQuotes.size))
  }


  println(getExistential(None))
  println(getExistential(None))
  println(getExistential(Some("Just do it!")))
}
