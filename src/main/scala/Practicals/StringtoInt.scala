package Practicals


object StringtoInt extends App {

  def stringToInt(stringList: List[String]): List[Int] = {

    val intList = stringList.map(string => string.toInt)
    intList
  }
  println(List("1", "2", "3"))
  println(stringToInt(List("1","2","2")))


  def stringToIntMultiply(stringList: List[String]): List[Int] = {
    val intList = stringList.map(string => string.toInt * 2)
    intList
  }

  println(stringToIntMultiply(List("1", "3", "4")))

  def stringToIntSum(stringList: List[String]): Int = {
    val intList = stringList.map(string => string.toInt * 2).sum
    intList
  }

  println(stringToIntSum(List("2", "3", "4")))


  //Write a function that accepts an optional Int and multiplies the integer by 12, if nothing is supplied return 12
  def intMultiply(input: Option[Int]): Int = {
    input match {
      case Some(number) => number * 12
      case None => 12
    }
  }
  println(intMultiply(Some(12)))
  println(intMultiply(None))

}