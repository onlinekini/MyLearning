
class Demo  {

  val a : Int = { // eager init during class creation
    println("eval EAGER A"); // called once at start initialization
    10
  }

  def b : Int = {
    println("Eval B") // Called everytime B is called. Because this is a function not a value
    20
  }

  lazy val c : Int = {
    println("Eval LAZY C")
    30
  }

}

val d = new Demo // Check "eval EAGER A" gets printed immediately and never again
d.a // only value
d.a // only value
d.a // only value
d.b // Both msg and val
d.b // Both msg and val
d.b // Both msg and val
d.c // Message printed only when called. That too once
d.c // only value

val d2 = new Demo // Check "eval EAGER A" gets printed immediately

