package Notes

object MapFunctions extends App {

  //Mapping on a collection allows an operation to be performed on every member of the collection.
  val result = List(1,2,3).map(number => number * 2)
  println(result)

  //An _ can be used as a shorthand to represent the input value
  val underscore = List(1,2,3).map(_ * 2)
  println(underscore)

  //The Map collection provides a tuple as the input for the map function and
  //can be mapped to a Seq or a Map if the output is a tuple or a single value


  //map function can also be used to create nested collections
  val lists = List(1,2,3).map(x => List(x*2, x*4, x*6))
  println(lists)

  //To transform a nested collection into a single collection the flatten function can be used.
  val flatten = List(1,2,3).map(x => List(x*2, x*4, x*6)).flatten
  println(flatten)

  //The flatMap function combines both the map and flatten functions into one.
  //For the flatmap function the output must be a container
  val flatmap = List(1,2,3).flatMap(x => List(x*2, x*4, x*6))
  println(flatmap)

  //combine with pattern matching to only apply flat map to specific values
  val caseFlat= List(1,2,3).flatMap {
    case x@(1 | 3) => Some(x * 2) //when x is 1 or 3, resolve x*2
    case _ => None
  }
  println(caseFlat)
  }
