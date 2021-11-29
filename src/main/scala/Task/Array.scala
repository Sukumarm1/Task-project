package Task

object Array extends  App {


  /* val m1 = List(5, 12, 3, 13)   //list
 
   val result = m1.max
   val result1 =m1.min
   println(result1)
 */

var a:Array[Int]=new Array[Int](5)
 a(0)=2055
  a(1)=21
  a(2)=50
  a(3)=100
  a(4)=200

 var f =(x:Int,y:Int) =>x max y

//println("Min number ===> " + a.reduceLeft(_ min _))
  println("Max number ===> " + a.reduceLeft(_ max  _))

}


