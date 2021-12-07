package oop

object SingleInheritance extends App {

  /*class Employee{
    var salary:Float = 10000
    println("Salary = "+salary)
  }

  class Programmer extends Employee{
    var bonus:Int = 5000
    println("Bonus = "+bonus)
  }

  var  salaryDeatils =new Programmer

  salaryDeatils*/

  class  Employee{
    def emp(Salary :Int): Unit = {
println(Salary)
    }
  }

  class  Programmer extends  Employee{
    def bon(Bonus :Int): Unit = {
      println(Bonus)

    }

  }

  var salaryDetails = new Programmer()
  salaryDetails.bon(100)

}
