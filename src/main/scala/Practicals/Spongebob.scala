package Practicals

object Spongebob extends App {

  val spongebobQuote: (Option[String]) => String = character => character match {
          case Some("spongebob") => "Excuse me, sir, but you’re sitting on my body, which is also my face."
          case Some("squidward") => "Too bad SpongeBob’s not here to enjoy Spongebob not being here"
          case Some("patrick") => "The inner machinations of my mind are an enigma"
          case Some("sandy") => "Stupidity isn't a virus, but it sure is spreading like one."
          case Some("gary") => "meow"
          case _ => "Aye-aye, captain!"
        }

  println(spongebobQuote(Some("connie")))
  println(spongebobQuote(Some("spongebob")))
  println(spongebobQuote(Some("gary")))


  }

