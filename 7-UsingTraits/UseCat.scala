object UseCat extends App {
  def useFriend(friend: Friend) = friend.listen

  val alf = new Cat("Alf")
  val friend : Friend = alf // ERROR

  useFriend(alf) // ERROR
}

