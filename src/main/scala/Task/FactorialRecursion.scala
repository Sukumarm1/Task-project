package Task

object FactorialRecursion extends App {

def factorialExample(n:Int): Int = {
if(n==1) 1
else n *factorialExample(n-1)
}

  println(factorialExample(5))

}
