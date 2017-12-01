class Pet(val name: String) {
  override def toString = name
}

class Dog (override val name : String) extends Pet(name)

def workWithPets(pets: Array[Pet]) {}

val dogs = Array(new Dog("Rover"), new Dog("Comet"))

// workWithPets(dogs) // Compilation ERROR

def playWithPets[T <: Pet](pets: Array[T]) = 
  println("Playing with pets: " + pets.mkString(", "))

playWithPets(dogs)

def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]) = {
  ///...
  val newToPets = fromPets
  newToPets
}

val pets = new Array[Pet](10)
val fromDogsToPets = copyPets(dogs, pets)
println("Playing with pets from dogs: " + fromDogsToPets.mkString(", "))
