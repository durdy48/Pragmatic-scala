package finance.currencies

import Currency._

object Charge {
  def chargeInUSD(money: Money) = {
    def moneyInUSD = convert(money, Currency.USD)
    s"charged $$${moneyInUSD.amount}"
  }
}
