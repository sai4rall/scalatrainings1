object ArraysExamples {
  def main(args: Array[String]): Unit = {


    var myar: Array[String] = new Array[String](3) //to create
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    var myList3 = Array.concat(myList1, myList2)
    // Print all the array elements
    for (x <- myList3) {
      println(x)
    }
  }
}
