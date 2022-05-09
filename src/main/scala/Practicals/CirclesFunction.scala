package Practicals

object CirclesFunction extends App {

  val priceIncludingVAT: BigDecimal => BigDecimal = (price) => price * BigDecimal(1.2)

  val pi = 3.14

  val circumferenceCalculator: (Double) => Double = (radius) =>
    2 * pi * radius


  println(circumferenceCalculator(2.0))
}
