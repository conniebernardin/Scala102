package Notes

object HOF extends App {

  //HIGHER ORDER FUNCTION
  //a function that accepts a function as a parameter and/or returns a function as a result.

  val usernamesToPasswords = Map(
    "James"->"someWeakPassword",
    "Vinnie"->"slightlyle55WeakPassword",
    "Dickie"->"M@5t3rPaS5W0rD"
  )
  def authorise[T](username: String, password: String, onSuccess: () => T): Either[String, T] = {
    usernamesToPasswords.get(username) match {
      case Some(usersPassword) if usersPassword == password => Right(onSuccess())
      case Some(usersPassword) if usersPassword != password => Left("Incorrect password")
      case None => Left("User not found")
    }
  }
  val successfulAuthorise = authorise("James", "someWeakPassword", () => "Authorised!")
  val wrongPassword = authorise("Vinnie", "someWrongPassword", () => "Autorisiert!")
  val notAUser = authorise("SomebodyElse", "doesn'tMatter", () => "Autorizzato!")
  println(successfulAuthorise)
  println(wrongPassword)
  println(notAUser)

}
