abstract class Food {
  def name : String
}

abstract class Fruit extends Food  // Class is abstract so no need to implement the  name function

class Orange (val name: String) extends Food // Changed the def to val and set the value

val Jaffa = new Orange ("Orange") // used it in implementing the class into a specific object

new Fruit {
  override def name: String = "Welcome1" // Anonymous
}


abstract class Vehicle (val name : String, val age : Int) {
  // The Val makes the value public to the argument.
  override def toString : String =
    s"$name is $age Years old"
}


class Car (
  name : String, // removing val makes it private, hence no override required
  val make : String,
  val model : String, // These are not in super class, hence no override
  age : Int
) extends Vehicle(name, age) {
  override def toString : String = {
    s"$name is of model and model $make n $model is $age year old ${super.toString}"

  }
}
// Using private variables without override
val Mustang = new Car("Sally", "Ford", "Mustang", 20)

class Bus (
            override val name : String, // now overrides the public val
            val make : String,
            val model : String,
            override val age : Int // same as name
          ) extends Vehicle(name, age) {
  override def toString : String = {
    s"$make n $model - ${super.toString}"
  }
}

// Using overriden public variables and using "Super's" toString method to generate the output
val B7R = new Bus (name ="Neeta", model="B7R", make="Volvo", age =30)
