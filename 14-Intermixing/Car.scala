package automobiles

class Car(val year: Int) {
  private[this] var miles: Int = 0

  def drive(distance: Int) { miles += distance }
  
  override def toString :  String = s"year: $year miles: $miles"
}

