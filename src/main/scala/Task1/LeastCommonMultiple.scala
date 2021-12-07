package Task1

object LeastCommonMultiple extends  App {

  def findLCM ( a :Int , b :Int): Int = {

  if (a%b ==0)
    a
  else
    findLCM(a+a, b)
}
  println(findLCM(50,60))

}