package Practicals

object Macbooks extends App {

  /*Write a function using map which :-
Takes a String “macbooks”
Maps on each char to make them uppercase, and returns “MACBOOKS ARE THE BEST”
*/

  //attempt one
  val macbooks = "macbooks".map(char => char.toUpper) + " ARE THE BEST"

  println(macbooks)


  //attempt two
  val macbookFunc: (String) => String = input => {
    val capital = input.map(char => char.toUpper)
    s"${capital} ARE THE WORST"
  }

  println(macbookFunc("windows"))
}
