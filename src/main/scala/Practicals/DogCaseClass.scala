package Practicals

object DogCaseClass extends App {

  val moose = Dog("Moose", "Cockapoo", 4)
  val maple = Dog("Maple", "Cockapoo", 5)
  val baloo = Dog("Baloo", "Working Cockaspaniel", 8)
  val meg = Dog("Meg", "Golden Retriever", 9)

  val jorge = Cat("Jorge Regula", "tortoise shell", isAffectionate = false)
  val josie = Cat("Aunty Josie", "shorthair", isAffectionate = true)

  val pineapple = Bird("Pineapple", "blue and green", 48, canFly = true)

  val kennel = Kennel("The Kennel", List(moose, maple, baloo, meg, jorge, josie, pineapple))


  val connieKennel = kennel.copy(name ="Connie's Kennel")

  println(connieKennel.animals)
  println(connieKennel.name)
}

case class Kennel(name: String, animals:List[animal] )

class animal()
case class Dog(name: String, breed: String, age: Int) extends animal
case class Bird(name: String, colour: String, wingspan: Int, canFly: Boolean) extends animal
case class Cat(name: String, breed: String, isAffectionate: Boolean) extends animal