package oop

object HierarchicalInheritance extends App{

  class Parent
  {
    var Name1: String = "Sukumar"
    var Name2: String = "Naveen"
  }

  class Child1 extends Parent
  {
    var Age: Int = 20
    def details1()
    {
      println(" Name: " +Name1);
      println(" Age: " +Age);
    }
  }


  class Child2 extends Parent
  {
    var Height: Int = 164

    def details2()
    {
      println(" Name: " +Name2);
      println(" Height: " +Height);
    }
  }

  val obj1 = new Child1();
  val obj2 = new Child2();

  obj1.details1()
  obj2.details2()

}
