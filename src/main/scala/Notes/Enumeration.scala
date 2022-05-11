package Notes

object Enumeration extends App {

  //Enumerations are a feature that are useful for representing finite sets of entities
  object Weekday extends Enumeration {
    val  Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  //can be serialised
  Weekday.Monday.toString

  //can also be deserialised
  Weekday.withName("Monday")
  Weekday.withName("Mondai") //can lead to nasty exceptions
}
