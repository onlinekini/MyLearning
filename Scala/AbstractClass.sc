class Person (name : String, age : Int) {
  def isAdult : Boolean  = age >= 38
}

val Vivek = new Person("Vivek", 39)
val Radhika  = new Person ("Radhika", 32)

Vivek.isAdult
Radhika.isAdult

val str = "Hello"
str.equals("Hello")
str.equals(new String("Hello"))
(new String("Hello")).equals(new String("Hello"))
str == "Hello"
str == new String("Hello")


abstract class AbsPerson (name : String, val age : Int) { // use val for the private variable to be used outside the class and by the extending object
  def isAdult : Boolean
}

val newVivek = new AbsPerson("Vivek", 40) {
  def isAdult = age >= 18
}
newVivek.isAdult;