package day5

object Curring {

    // Define currying function
    def add(x: Int, y: Int) = x + y;
  def add2(a: Int) = (b: Int) => a + b;
    def main(args: Array[String])
    {
      println(add(20, 19));
      println(add2(10)(20))
    }
}
