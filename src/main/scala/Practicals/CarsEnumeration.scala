package Practicals

import Practicals.Cars.{Daihatsu, Honda, Mazda, Mitsubishi, Nissan, Suzuki, Toyota}

object CarsEnumeration extends App {

  def allCars(): List[Cars] = {
    List(Honda, Mitsubishi, Toyota, Nissan, Mazda, Suzuki, Daihatsu)
  }

  println(allCars())
}
sealed trait Cars

object Cars {
  case object Honda extends Cars

  case object Mitsubishi extends Cars

  case object Toyota extends Cars

  case object Nissan extends Cars

  case object Mazda extends Cars

  case object Suzuki extends Cars

  case object Daihatsu extends Cars

}