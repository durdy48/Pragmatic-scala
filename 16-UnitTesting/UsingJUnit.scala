import java.util.ArrayList
import org.junit.Test
import org.junit.Assert._

class UsingJUnit {
  @Test
  def listAdd() {
    val list = new ArrayList[String]
    list.add("Milk")
    list add "Sugar"
    assertEquals(2, list.size)
  }
}
