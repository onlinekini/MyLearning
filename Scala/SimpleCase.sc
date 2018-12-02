import java.time.LocalDate

case class Car (model : String, year: Int, name : String) {
  lazy val vintage = LocalDate.now.getYear - year > 20
}// Case classes have the vals automatically put in them

class Bus (val model : String, val year: Int, val name : String) {
  lazy val vintage = LocalDate.now.getYear - year > 20
}// not a case class add parametric val

val mustang = Car("Mustang", 1990, "torro")// To String - check
// creates the object using the apply method - Factory
mustang.vintage
mustang.model
mustang.year
mustang.name
mustang ==  Car("Mustang", 1990, "torro")
mustang ==  Car("Mustang", 1991, "torro")
// Even if diff object.

val b7r = new Bus("Volvo", 1980, "b7r") // only hash code
b7r.model
b7r.name
b7r.vintage
b7r.year
b7r == new Bus("Volvo", 1980, "b7r")
b7r == new Bus("Volvo", 1986, "b7r")
