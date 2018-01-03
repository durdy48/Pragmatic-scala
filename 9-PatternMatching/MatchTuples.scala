def processCoordinates(input: Any) {
  input match {
    case (lat, long) => printf("Processing (%d, %d)...", lat, long)
    case "done" => println("done")
    case _ => println("invalid input")
  }
}

processCoordinates((39, -104))
processCoordinates("done")
