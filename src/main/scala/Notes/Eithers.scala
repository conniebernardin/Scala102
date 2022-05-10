package Notes

object Eithers extends App {

  //takes two type parameters- one right and one left
  //commonly used for error handling where Left is the error case and right is the success case
  //good alternative to try catch if you want to do more than throw an error

  def getIntAndAdd1(s: String): Either[String, Int] = {
    try {
      Right(s.toInt)
    } catch {
      case e: Exception => Left("Failed")
    }
  }

  /*  If you want to perform a function on an Either directly, you can first call
   .isLeft or .isRight
   on the Either to find out which projection of the Either you are dealing with.

   Then you can process the Either’s value using .left or .right using map.
*/

  println(getIntAndAdd1("12").right.map(num => num + 1))
  println(getIntAndAdd1("fail").left.map(word => word.toUpperCase()))
  println(getIntAndAdd1("hello").right.map(num => num + 1))


  //You can avoid checking for isLeft or isRight by using pattern matching.
  // If a Left is returned do one thing and a Right, do another.

  getIntAndAdd1("12") match {
    case Left(_) => println("We have a left")
    case Right(_) => println("We have a right")
  }
//
//  def userExists(username: String, password: String): Boolean = {
//    (username, password) match {
//         case ("Connie Bernardin", "cutecats123") => true
//    case ("Sarooon", "puppydog5") => true
//    case ("Robyn", "MooseAndMaple") => true
//    case _ => false
//  }
//}
//
//  def userEitherFunction(username: String, password: String): Either[Exception, Boolean] = {
//    if (!userExists(username, password)) Left(Exception("UserNotFoundException"))
//    else Right(userExists(username, password))
//  }
//
//  println(userEitherFunction("lol", "123"))
}
