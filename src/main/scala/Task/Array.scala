package Task

import scala.annotation.tailrec

object Array extends  App {


  /* val m1 = List(5, 12, 3, 13)   //list
 
   val result = m1.max
   val result1 =m1.min
   println(result1)
 */

/*var a:Array[Int]=new Array[Int](5)
 a(0)=2055
  a(1)=21
  a(2)=50
  a(3)=100
  a(4)=200


println("Min number ===> " + a.reduce(_ min _))
  println("Max number ===> " + a.reduce(_ max  _)) */

  final def max(xs: List[Int]): Int = {
    @tailrec
    def maxExample(xs: List[Int], max: Int): Int = xs match {
      case Nil => max
      case x::xs1 => if(x > max)
      // i)want min value change to <
      // ii) -> x::y::xs- This will match lists of length two or more.
      // -> Here, it binds x to the first element in the list, y to the second, and xs to the remainder.
        maxExample(xs1, x)
      else maxExample(xs1, max)
    }
    maxExample(xs.tail, xs.head)
  }
  println("max value ===> " + max(List(1000000000,10000,800,20,31,55,100,91,444)))
 // println("Min value ===> "+ max(List(800,20,31,55,100,91,444)))

}


