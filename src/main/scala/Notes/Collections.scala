package Notes

//import Notes.Collections.setOne

import scala.collection.immutable.Queue

object Collections extends App {

  //A List is a collection that allows quick operation on the head and tail of the collection.
  val list = List(0,1,2,3,4)

  //There is a very similar collection type called Stream. This is a lazy version of a List
  val stream = Stream(2,4,6,8)

  //A Queue is a first-in, first-out collection (FIFO)
  //Where List was great for working with the first element, a queue is efficient for both the first and last elements
  val queue = Queue(1, 2, 3, 4, 5, 6, 7, 8)


  //sets contain no duplicate elements
  //a set will remove duplicates but not preserve the order

  //A Map consists of pairs of keys and values
  Map(("x", 24), ("y", 25), ("z", 26))
//or commonly simplified with arrow
  Map("x" -> 24, "y" -> 25, "z" -> 26)



}
