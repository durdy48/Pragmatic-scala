class Sample {
  def unary_+() = println("Called unary +")
  def unary_-() = println("Called unary -")
  def unary_!() = println("Called unary !")
  def unary_~() = println("Called unary ~")
}

val sample = new Sample
+sample
-sample
!sample
~sample

