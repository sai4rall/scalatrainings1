object HigherOrder1 {
def myfunction (v:Int, myf:(Int,Int)=>Int):Int={
var x=v*myf(v,v);
return x;
}

  def add(a:Int,b:Int): Int = {
    return a+b
  }
  def sub(a:Int,b:Int): Int = {
    a-b
  }

  def main(args: Array[String]): Unit = {
    println(myfunction(120, add))
  }
}
