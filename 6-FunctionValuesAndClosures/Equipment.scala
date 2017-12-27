class Equipment(val routine : Int => Int) {
  def simulate(input : Int) = {
    print("Running simluation...")
    routine(input)
    }
}

