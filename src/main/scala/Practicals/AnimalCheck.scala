package Practicals

object AnimalCheck extends App {
/*. Create an Animal abstract class (define name and age vals within the class, not as a parameter)
 Create a Dog case class with name and age (extend the Animal abstract class)
Create a Cat case class with name and age (extend the Animal abstract class)
Write a function that checks the type of “Animal” and returns “Dog” for a dog, “Kitty” for a cat and “Other” for anything else
Write a function that checks if the animal is called Sam and returns “Sam’s age is: <age>” if the animal’s name is “Sam” or “<name> is not Sam” for anything else
 Write a function that returns “<name> is <age> years old” if the animal is older than 10, or “<name> is young” for anything else
*/

  abstract class Animal{
    val name: String
    val age: Int
  }
  case class Dog(name: String, age:Int) extends Animal
  case class Cat(name: String, age: Int) extends Animal

  def animalChecker(animal: Animal): String = {
    animal match {
      case Dog(name, age) => "doggo"
      case Cat(name, age) => "puss"
      case _ => "other"
    }
  }

  def nameChecker(animal: Animal): String = {
    animal match {
      case Dog("sam", age) => s"Sam's age is: $age"
      case Dog(name, age) => "Dog is not called Sam"
      case _ => "Not even a dog babes"
    }
  }

  def ageChecker(animal: Animal): String = {
    animal match {
      case Dog(name, age) if age > 10 => s"$name is $age years old"
      case Dog(name, age) if age <= 10 => s"$name is young"
      case Cat(name, age) if age > 10 => s"$name is $age years old"
      case Cat(name, age) if age <= 10 => s"$name is young"
      case _ => "invalid"
    }
  }



  val baloo = Dog("Baloo", 8)
  val sam = Dog("sam", 12)
  val luke = Dog("luke", 14)
  val jimmy = Cat("jimmy", 2)

  println(animalChecker(baloo))
  println(animalChecker(jimmy))

  println(nameChecker(sam))
  println(nameChecker(luke))
  println(nameChecker(jimmy))

  println(ageChecker(luke))
  println(ageChecker(jimmy))
}
