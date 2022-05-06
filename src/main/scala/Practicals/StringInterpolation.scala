package Practicals

object StringInterpolation extends App {

  val p1 = new Person("Connie", 22)
  val p2 = new Person("Saroooon", 23)

  println(s"${p2.name} is ${p2.age - p1.age} years older than ${p1.name}")
}

class Person(val name: String = " ", val age:Int = 10)

