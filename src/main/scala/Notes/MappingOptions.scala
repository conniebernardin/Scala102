package Notes

object MappingOptions extends App {

  //Mapping on an option allows for us to specify an action to be done if there is something within the Option
  Some(3).map(number => number * 3)

  Some(3).map{
    case 1 => 10
    case x => x * 2
  }
  //If a value is present then the function is applied to the value.
  //If it is empty then None is returned
  Option.empty[Int].map(number => number * 3)

//The flatMap function in options is similar to the collections flatMap and is used when the return value is itself an option.
  Some(3).flatMap(x => if(x == 3) Some(9) else None)
  Some(2).flatMap(x => if(x == 3) Some(9) else None)
  Option.empty[Int].flatMap(x => if(x == 3) Some(9) else None)

}
