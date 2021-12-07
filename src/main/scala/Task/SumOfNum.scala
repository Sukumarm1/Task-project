package Task

object SumOfNum extends App {

  def sum(num :Int):Int ={

    if(num ==0)0 else (num %10 ) + sum(num/10)
  }
println(sum(523 ))
}
