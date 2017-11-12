package finance.currencies

import Currency._

object Converter {
  def converter(money: Money, to: Currency) = {
    //fetch current market rate... using mocked value here
    val conversionRate = 2
    new Money(money.amount * conversionRate, to)
  }
}
