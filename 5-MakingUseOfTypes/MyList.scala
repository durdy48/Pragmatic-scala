class MyList[+T] {
  override def toString = "gola"
}
var list1 = new MyList[Int]
var list2 : MyList[Any] = null
list2 = list1 // OK
