import org.scalatest._
import java.util.ArrayList

class UsingScalaTest extends FlatSpec with Matchers {
  trait EmptyArrayList {
    val list = new ArrayList[String]
  }

  "a list" should "be empty on create" in new EmptyArrayList {
    list.size should be (0)
  }

  "a list" should "increase in size upon add" in new EmptyArrayList {
    list.add("Milk")
    list add "Sugar"

    list.size should be (2)
  }
}
    
