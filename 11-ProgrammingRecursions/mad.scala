def mad(parameter: Int) : Int = {
  if(parameter == 0)
    throw new RuntimeException("Error")
  else
    1 * mad(parameter - 1)
}

// mad(5)

def mad2(parameter: Int) : Int = {
  if(parameter == 0)
    throw new RuntimeException("Error")
  else
    mad2(parameter - 1)
}
mad2(5)
