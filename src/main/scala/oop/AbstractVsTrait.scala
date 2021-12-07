package oop

object AbstractVsTrait extends App {

  //Abstract(the thing) = we can pass constructor arguments - (var a:String)

  abstract class CarModel  {
    def fuelCapacity() :String = "30 liters"
    def gearType() :String
  }

/*  class Audi extends Car {

    override def gearType(): String = "Automatic"
  }*/

  //Trait (behaviour)=  we can't give constructor argument inside the trait - (val b :String)

  trait Speed {

    def topSpeed() : String = "250 km"
    def capacitySeats() : String
  }

  class Audi extends CarModel with Speed {

    override def gearType(): String = "Automatic"

    override def capacitySeats(): String = " 2 Seater"
  }

  var car = new Audi
  println(car.fuelCapacity())
  println(car.gearType())
  println(car.capacitySeats())
  println(car.topSpeed())
}
