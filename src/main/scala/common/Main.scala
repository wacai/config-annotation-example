package common

import scala.concurrent.duration._
import com.wacai.config.annotation.conf

object Main extends App {

  println(new Consumer().server.port)

  class Consumer extends kafka {}

  @conf trait kafka {
    val server = new {
      val host = "localhost"
      val port = 9092
    }

    val socket = new {
      val timeout = 3 seconds
      val buffer = 1024 * 64L
    }

    val client = "id"
    val debug = false
  }
}
