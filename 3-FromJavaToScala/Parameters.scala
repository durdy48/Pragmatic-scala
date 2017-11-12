def max(values: Int*) = values.foldLeft(values(0)) { Math.max }

println(max(8, 2, 3))

println(max(2, 5, 3, 7, 1, 6))
