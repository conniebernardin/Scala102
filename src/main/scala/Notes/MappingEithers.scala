package Notes

import scala.collection.immutable.Nil.map

object MappingEithers extends App {

 /* //The map function allows you to perform actions on the value of the right side of an either.
  Right[String, Int](3).map(number => number * 3)

  //If a value is a Right then the function is applied to the value.
  Right[String, Int](1).map{
    case 1 => 10
    case x => x * 2
  }

  //If it is Left then the Left is returned
  Left[String, Int]("Hi").map(number => number * 3)



  //The flatMap function in Eithers is similar to the options flatMap
  // and is used when the return value is itself an either.
  Right[String, Int](3).flatMap(x =>
    if(x == 3) Right[String, Int](9)
    else Left[String, Int])*/
}
