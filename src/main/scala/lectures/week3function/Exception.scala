package lectures.week3function

object Exception extends App {
  import scala.util.{Try, Failure, Success}


  def methodWhichFails(): Try[String] = Failure(new RuntimeException("Ooops..."))
  def methodWhichSucceeds(): Try[String] = Success("Everything is OK")

  val tryMethods = methodWhichFails() orElse methodWhichSucceeds()

  println(tryMethods) // Success(Everything is OK)
}
