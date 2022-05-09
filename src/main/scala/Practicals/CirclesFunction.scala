package Practicals

object CirclesFunction extends App {

  val priceIncludingVAT: BigDecimal => BigDecimal = (price) => price * BigDecimal(1.2)

  val pi = 3.14

  val areaCalculator: (Double) => Double = (radius) =>
    pi * (radius * radius)

  val circumferenceCalculator: (Double) => Double = (radius) =>
    pi * radius * 2

  println(areaCalculator(2.5))
  println(circumferenceCalculator(2.5))


  

}
