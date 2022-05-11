package Practicals

object GradingMaps extends App {

  val scores = Seq(None, Some("A"), Some("B"), Some("C"), None, Some("F"))

  def gradingConversion(input: Seq[Option[String]]): Seq[Char] = {
    input.flatMap{
      case Some(grade) => grade
      case None => "F"
    }
  }

  println(gradingConversion(scores))

}
