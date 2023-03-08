package day5

object pureFunction {
  def main(args: Array[String]): Unit = {
    println(sum(10,40))
  }
  def sum(i:Int,j:Int):Int={
     i+j
  }
}
