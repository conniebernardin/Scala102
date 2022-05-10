package Practicals

object EitherStyle extends App {
    def parse(s: String): Either[NumberFormatException, Int] =
      if (s.matches("-?[0-9]+")) Right(s.toInt)
      else Left(new NumberFormatException(s"${s} is not a valid integer"))

  println(parse("23").isRight)
  println(parse("twenty").isLeft)
//  println(parse(100).isLeft)
  println(parse(100.toString).isLeft)
  println(parse("21.5").isRight)
}
