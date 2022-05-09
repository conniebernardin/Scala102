package Notes

object Functions extends App {

  /*
  A function is defined like so:
  val <name of function>: (<input type>) => <return type> = (<name assigned to input types separated by commas>) => {
    <steps/instructions>
      <last steps/instructions results in a value that is of the same type as the return type defined>
    }
*/

  //VAT method
  val priceIncludingVat: BigDecimal => BigDecimal = (price) => {
    price * BigDecimal(1.2)
  }

  //Could also be written like:
  val priceIncludingVAT: BigDecimal => BigDecimal = (price) => price * BigDecimal(1.2)


  //A side effect is when the function has an effect on the application other than the result it returns.
  //A pure function has no side effects
  //To be a pure function it should just return a value based on the inputs provided.

  //example of pure function
  val sentence: String = ""

  def append(sentence: String, word: String): String =
    sentence + " " + word.trim()

  val a = append(sentence, "Allo") // "Allo"
  val b = append(sentence, "Allo") // "Allo"


  //example of impure function
  var sent: String = ""

  def append(word: String): String = {
    sent = sent + " " + word
    sent.trim()
  }

  val x = append("Allo") // "Allo"
  val y = append("Allo") // "Allo Allo"


  //Referential transparency simply means a function's return value is based solely on the inputs

  //default parameters
  def greeting(greeting: String = "Hi",
               name: String = "Mac",
               punctuation: String = "!"): String = {
    greeting + " " + name + punctuation
  }

  val aa = greeting("Hi", "Mac", "!")   // "Hi Mac!"
  val bb = greeting() 	  			    // "Hi Mac!"
  val c = greeting("Hello") 		    // "Hello Mac!"
  val d = greeting("Mornin", "Angle")  // "Mornin Angle!"
  val e = greeting(",") 		  	    // ", Mac!"

}
