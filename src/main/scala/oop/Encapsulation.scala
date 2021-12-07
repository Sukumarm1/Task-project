package oop

object Encapsulation extends  App {

  class Sample {
    // Inner class1
    class P1 {
      var a = 1
      def method() {
        for (a <- 0 until  1)
          println("Hello all")

      }
    }
  }

  class Sample1 {
    // Inner class2
    class P2 {
      var b = 1
      def method1() {
        for (b <- 0 until  1)
          println("Hello all !!!! Welcome")

      }
    }
  }
      // Creating object of the outer and
      // inner class Here, P1 class is
      // bounded with the object of Sample class
      val obj = new Sample()
      val o = new obj.P1
      o.method()

  val obj1 = new Sample1()
  val b = new obj1.P2
  b.method1()

}