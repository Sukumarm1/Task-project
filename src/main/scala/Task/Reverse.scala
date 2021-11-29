package Task

object Reverse extends App {

  def reverse(s: String) : String = {
    (for(i <- s.length until  0 by -1)
      yield s(i-1)).mkString
  }

  println(reverse("Sukumar is on call"))

}
