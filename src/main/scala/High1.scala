object High1 {
def myCalculater(a:Int,b:Int,func:(Int)=>Int):Int=func(a)+func(b)


  def main(args: Array[String]): Unit = {
    var c=myCalculater(10,20,squre)
    var c1=myCalculater(10,20,cube)
    var c3=myCalculater(10,30,(x:Int) => x*x*x*x);


    println(c)
    println(c1)
    println(s"===> $c3")
  }


  def squre(a:Int): Int = (a*a);
  def cube(a:Int): Int =  (a*a*a)

}
