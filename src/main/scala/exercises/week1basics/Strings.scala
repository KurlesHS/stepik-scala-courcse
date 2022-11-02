package exercises.week1basics

object Strings extends App {
  val input = "I like     Scala"

  def go(input : String, acc : String,  acc2: String): String = {
    if (input.isEmpty) {
      if (acc2.nonEmpty) {
        return acc + ' ' + acc2
      }
      return acc
    }
    val c = input.last
    if (c == ' ') {
      if (!acc2.isEmpty) {
        if (acc.nonEmpty) {
          return go(input.take(input.length - 1), acc + ' ' + acc2, "")
        } else {
          return go(input.take(input.length - 1), acc2, "")
        }
      }
      return go(input.take(input.length - 1), acc, "")
    }
    go(input.take(input.length - 1), acc, input.last + acc2)
  }
  println(go(input, "", ""))
}
