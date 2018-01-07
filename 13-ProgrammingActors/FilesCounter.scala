import akka.actor._
import akka.routing._
import java.io._

class FilesCounter extends Actor {
  val start = System.nanoTime
  var filesCount = 0L
  var pending = 0

  val fileEplorers = 
    context.actorOf(RoundRobinPool(100).props(Props[FileExplorer]))

  def receive = {
    case dirName : String =>
      pending = pending + 1
      fileExplorers ! dirName
    case count : Int => 
      filesCount = filesCount + count
      pending = pending - 1

      if(pending == 0) {
        val end = System.nanoTime
        println(s"Files count: $filesCount")
        println(s"Time taken: ${(end - start)/1.0e9} seconds")
        context.system.shutdown()
      }
  }
}

