

class AAA(val xc: Int, val yc: Int) 
{
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

object Test
{
   def main(args: Array[String]) 
   {
      val pt = new AAA(10, 20);

      // Move to a new location
      pt.move(10, 10);
      val zhaicar=new car(198,"Passat")
      addup(234,765)
   }
   def addup(a:Int, b:Int):Int=
   {
     return (a+b)
   }
}

class car(val w:Int, val c:String)
{
    println("this car weight is" +w)
}