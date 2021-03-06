val xmlFragment = 
  <symbol>
    <symbol ticker="AAPL"><units>200</units></symbol>
    <symbol ticker="IBM"><units>215</units></symbol>
  </symbol>

println(xmlFragment)
println(xmlFragment.getClass)

var symbolNodes = xmlFragment \ "symbol"
symbolNodes foreach println
println(symbolNodes.getClass)

var unitsNodes = xmlFragment \\ "units"
unitsNodes foreach println
println(unitsNodes.getClass)
println(unitsNodes.head.text)

unitsNodes.head match {
  case <units>{numberOfUnits}</units> => println(s"Units: $numberOfUnits")
}

println("Ticker\tUnits")
xmlFragment match {
  case <symbols>{symbolNodes @ _* }</symbols> =>
    for(symbolNode @ <symbol>{_*}</symbol> <- symbolNodes) {
      println("%-7s %s".format(
        symbolNode \ "@ticker", (symbolNode \ "units").text))
    }
}
  

