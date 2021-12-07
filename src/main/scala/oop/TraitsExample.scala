package oop

trait TraitsExample {
    def topSpeed(): String = "250 km"
    def capacitySeats(): String
}

trait Fuel {
  def fuelCapacity() : String
}

trait  Color{
  def colorModel() : String
}

  class CarType extends  TraitsExample with Fuel with Color {

    def modelCar () : String = "BMW"
    override def capacitySeats(): String = "2 seater"

    override def fuelCapacity(): String = "30lit"

    override def colorModel(): String = " Red"
  }
  object  name {
    def main(args: Array[String]): Unit = {

 val print = new CarType
 println(print.topSpeed())
println(print.colorModel())
}
  }