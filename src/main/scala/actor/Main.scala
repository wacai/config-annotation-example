package actor

import akka.actor._
import com.wacai.config.annotation.{Configurable, conf}

object Main extends App {

  val system = ActorSystem("config")

  system.actorOf(Props[Toy]) ! 'touch

  class Toy extends Actor with settings {
    def receive = {
      case _ =>
        println(s"toy's name is $name")
        context.system.shutdown()
    }
  }

  @conf trait settings extends Configurable {
    self: Actor =>

    val name = "lego"

    def config = context.system.settings.config
  }

}
