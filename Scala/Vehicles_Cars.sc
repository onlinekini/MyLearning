abstract class Vehicle {
  def name:String
  def desc: Vector[String]
  override def toString= s"Vehicle - $name"

  def fullDescription = {
    (name +: desc).mkString("\n")
  }
}

case class Car(name : String, desc: Vector[String]) extends Vehicle

val mustang = Car("Ford Mustang" , Vector("1965 Mustang", "v8", "Met Blue"))

val datsun = Car("Datsun Go" , Vector("2018 Go", "v4", "Purple"))
