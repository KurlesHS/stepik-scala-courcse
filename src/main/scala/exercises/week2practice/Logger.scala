package exercises.week2practice

object Logger extends App {
  class Logger(val numMsg : Int = 0) {
    def info() : Logger = {
      println("INFO New Message")
      new Logger(numMsg + 1)
    }

    def info(cnt : Int): Logger = {
      if (cnt == 0) return this
      info.info(cnt - 1)
    }
    def print = println(numMsg)
  }
  val logger = new Logger
  logger.info.print
  logger.info(3).print
  logger.info.info.info.print

}
