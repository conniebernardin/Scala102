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
}