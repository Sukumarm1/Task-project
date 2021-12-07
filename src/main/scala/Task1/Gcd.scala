package Task1

object Gcd extends App {

  def gcd(x:Int, y:Int): Int=
  {
    if (y == 0) x
    else gcd(y, x % y)
  }

  println(gcd(12,18))

}
