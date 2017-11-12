import scala.collection.mutable._

class Marker private(val color: String) {
  println(s"Creating ${this}")

  override def toString = s"marker color $color"
}

object Marker {
  private val markers = Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "yellow" -> new Marker("yellow"))

  def getMarker(color: String) = 
    markers.getOrElseUpdate(color, new Marker(color))
}

println(Marker getMarker "blue")
println(Marker getMarker "blue")
println(Marker getMarker "red")
println(Marker getMarker "red")
println(Marker getMarker "green")

//val m = new Marker("pink")
//println(m)
