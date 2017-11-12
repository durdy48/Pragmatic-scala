def getPersonInfo(primaryKey : Int) = {
  // Assume primaryKey is used to fetch a person's info...
  // Here reponse is hard-coded
  ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
}

val (firstName, lastName, emailAddress) = getPersonInfo(1)

println(s"First Name: $firstName")
println(s"Last Name: $lastName")
println(s"Email Address: $emailAddress")


