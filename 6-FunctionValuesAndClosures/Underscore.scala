val arr = Array(1, 2, 3, 4, 5)

val total = (0 /: arr) { (sum, elem) => sum + elem }

val total2 = (0 /: arr) { _ + _ }

println(total)
println(total2)

val negativeNumbersExists1 = arr.exists { elem => elem < 0 }
val negativeNumbersExists2 = arr.exists { _ < 0 }

println(negativeNumbersExists1)
println(negativeNumbersExists2)

val largest = (Integer.MIN_VALUE /: arr) { (carry, elem) => Math.max(carry, elem) }
println(largest)

val largest2 = (Integer.MIN_VALUE /: arr) { Math.max(_, _) }
println(largest2)

val largest3 = (Integer.MIN_VALUE /: arr) { Math.max _ } 
println(largest3)

val largest4 = (Integer.MIN_VALUE /: arr) { Math.max }
println(largest4)
