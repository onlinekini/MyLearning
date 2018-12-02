abstract class Upper {
  def fld1: String
  val fld2: String = "someString"
  def fld3 : String = "Function Returns a String"
  def mth(arg1 : Int, arg2 : Int) = arg1 + arg2
}

class Lower extends Upper {
  def fld1 : String = "New implementation without an override and it works" // as it is not implemented, override is implicit, but not wrong if added
  override val fld2 : String = "This wont work without ovrrd"
  override def fld3 : String = "Function wont run without ovrrd"
  override def mth(arg1: Int, arg2: Int) = arg1 - arg2
  def mth(arg1 : Double, arg2 : Double) = arg1 * arg2
  // The mth method is a different overloaded methos with different args
  // hence no override required
}


val lwr = new Lower
lwr.mth(100,100) // Both Int
lwr.mth(100,100.1) // One int other DBL
lwr.mth(100.1,100.1) // Both DBL