package day5

import scala.math.BigDecimal.double2bigDecimal

object Range {
  def main(args: Array[String]): Unit = {
    var r1=1 to 10
    var r2=1 until  10
    println(r2)
    println(r2++r1)

    val oddRange = 1 to 100 by 2
    val evenRange = 10 to 100 by 2
    println(oddRange)
    oddRange.foreach(i=>println(i))
    evenRange.foreach(i=>println(i))
    val doubleRange = 1.0 to 2.0 by 0.2
    doubleRange.foreach(i=>println(i))


    val range = 1 to 10

    val take2: Range = range.take(2)
take2.foreach(i=>println(i))
println("_____________________")
    val drop5: Range = range.drop(5)
    drop5.foreach(i=>println(i))


  }
}
