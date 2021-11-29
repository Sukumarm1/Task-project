package Task

import scala.annotation.tailrec

object FactorialTailRecursion extends  App {

  final def factorial(x:Int): Int ={

    @tailrec
     def factorialExample(i :Int, x:Int):Int ={
      if(x<=1) i
      else factorialExample( x * i , x -1)
    }
    factorialExample(1,x)
  }
  println(factorial(5))

}
