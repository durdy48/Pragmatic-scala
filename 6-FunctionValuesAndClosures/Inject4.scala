def inject(arr: Array[Int], initial: Int)(operation: (Int, Int) => Int) = {
  var carryOver = initial
  arr.foreach(element => carryOver = operation(carryOver, element))
  carryOver
}

val sum = inject(array,0) { (carry, elem) => carryOver + elem }

