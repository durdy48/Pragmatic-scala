import akka.actor._

object CreateActors extends App {
  val system = ActorSystem("sample")

  val depp = system.actorOf(Props[HollywoodActor])
  val hanks = system.actorOf(Props[HollywoodActor])

  depp ! "Wonka"
  hanks ! "Gump"

  depp ! "Sparrow"
  hanks ! "Phillips"
  println(s"Calling from ${Thread.currentThread}")

  system.shutdown()
}

