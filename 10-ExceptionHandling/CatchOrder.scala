val amount = -2
try {
  print(s"Amount: $$$amount ")
  println(s"Tax: $$${Tax.taxFor(amount)}")
}
catch {
  case ex : Exception => println("Something went wrong")
  case ex : IllegalArgumentException => println(ex.getMessage)
}
