package day5

object clousure {
  def main(args: Array[String]): Unit = {
    // defined the value of p as 10
    val p = 10

    // define this closure.
    def example(a: Double) = {
      a * p / 100
    }
   println(example(100))
  }

}
