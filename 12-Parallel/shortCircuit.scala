def expensiveComputation() = {
  println("...assume slow operation...")
  false
}

lazy val perform = expensiveComputation()
def evaluate(input: Int) = {
  println(s"evaluate called with $input")
  //if(input >= 10 && expensiveComputation())
  if(input >= 10 && perform)
    println("doing work...")
  else
    println("skipping")
}

evaluate(0)
evaluate(100)
