package Task1

object OddElements extends App {

  val numbers = List(1, 2, 3, 4, 5, 7, 9, 11, 14, 12, 16 , 25 , 36 , 55, 14, 259, 45)

  val odd = numbers.filter(_ % 2 != 0)

  val result = odd.sum

  println("Odd number of the said list: >>>>>    " + result )
}
