object HighOrder3 {

  def mathOperation(name: String): (Int, Int) => Int =
    (x: Int, y: Int) => {
    name match {
      case "addition" => x + y
      case "multiplication" => x * y
      case "division" => x / y
      case "subtraction" => x - y
    }
  }

  def add: (Int, Int) => Int = mathOperation("addition")

  def mul: (Int, Int) => Int = mathOperation("multiplication")

  def div: (Int, Int) => Int = mathOperation("division")

  def sub: (Int, Int) => Int = mathOperation("subtraction")

  def main(args: Array[String]): Unit = {
   var v= add(10,4)
   println(v)
  }
}


