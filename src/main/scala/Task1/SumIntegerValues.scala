package Task1

object SumIntegerValues extends App {

  def test(x:Int, y:Int) : Int =
  {
    if (x == y) (x + y) * 3
    else x + y
  }

    println("Result: " + test(1, 2));
    println("Result: " + test(2, 2));
  println("Result : " + test(3,4))
  println("Result: " + test(4, 4));


}
