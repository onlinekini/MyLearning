abstract class Upper {
  def fld1: String
  val fld2: String = "someString"
  def fld3 : String = "Function Returns a String"
}

class Lower extends Upper {
  def fld1 : String = "New implementation without an override and it works" // as it is not implemented, override is implicit, but not wrong if added
  override val fld2 : String = "This wont work without ovrrd"
  override def fld3 : String = "Function wont run without ovrrd"

}