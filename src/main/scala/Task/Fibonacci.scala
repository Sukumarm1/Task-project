package Task

import scala.annotation.tailrec

object Fibonacci extends App {

  def fibonacciExample(X :Int) : BigInt = {
    @tailrec
    def fibonacci(X: Int, Y: BigInt=0, Z: BigInt=1): BigInt = X match {
      case 0 => Y
      case 1 => Z
      case _ => fibonacci(X - 1, Z, (Z + Y))

    }

    fibonacci(X)

  }
  println(fibonacciExample(100))

}
