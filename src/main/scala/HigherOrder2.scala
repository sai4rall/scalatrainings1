object HigherOrder2 {
def myfunc():(String,String)=>String ={
  return myfunc2;
}
  def myfunc2(a: String,b: String): String = {
    return a.toUpperCase()+b.toUpperCase();
  }

  def main(args: Array[String]): Unit = {
    var v=myfunc();
    println(v("hello","hai"))
  }
}
