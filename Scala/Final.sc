class Authority {
  final def finalWork : String = "This is the final Word"
}

class AuthorityOverride {
  //override def finalWork : String = "No it wont"
  // Cant override final - This wont compile
}

final class FinalAuth {
  // Do Something
}

/*
class Subordinate extends FinalAuth {
  // This wont compile either.
}
*/
