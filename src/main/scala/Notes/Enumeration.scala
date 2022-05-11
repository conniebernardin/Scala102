package Notes

object Enumeration extends App {

  //Enumerations are a feature that are useful for representing finite sets of entities
  object Weekdays extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  //can be serialised
  println(Weekdays.Monday.toString)

  //can also be deserialized
  Weekdays.withName("Monday")
//  Weekdays.withName("Mondai") //can lead to nasty exceptions

  //Can be given unique values
  object Weekday extends Enumeration {

    val Monday: Weekday.Value = Value("Mon")
    val Tuesday: Weekday.Value = Value("Tue")
    val Wednesday: Weekday.Value = Value("Wed")
    val Thursday: Weekday.Value = Value("Thur")
    val Friday: Weekday.Value = Value("Fri")
    val Saturday: Weekday.Value = Value("Sat")
    val Sunday: Weekday.Value = Value("Sun")
  }
  println(Weekday.Monday.toString)

  //All values of an Enumeration type can be listed using .values
  println(Weekday.values)


  //Values are inherently ordered
  println(Weekdays.Monday < Weekdays.Tuesday)
  println(Weekdays.Sunday > Weekdays.Monday)
  println(Weekdays.Monday == Weekdays.Monday)
  println(Weekdays.Saturday > Weekdays.Sunday)


  //ordering can be modified
  object WeekdayMod extends Enumeration {

    val Monday = Value(6)
    val Tuesday = Value(5)
    val Wednesday = Value(4)
    val Thursday = Value(3)
    val Friday = Value(2)
    val Saturday = Value(1)
    val Sunday = Value(0)

  }

  println(WeekdayMod.values.toList.sorted)




  //trait
  def test(weekday: WeekdayTrait) = {
    weekday match {
      case Monday => println("I hate Mondays")
      case Sunday => println("The weekend is already over? :( ")
    }//not exhaustive, would fail with any other day
  }

  println(test(Monday))


}

sealed trait WeekdayTrait

case object Monday extends WeekdayTrait
case object Tuesday extends WeekdayTrait
case object Wednesday extends WeekdayTrait
case object Thursday extends WeekdayTrait
case object Friday extends WeekdayTrait
case object Saturday extends WeekdayTrait
case object Sunday extends WeekdayTrait



