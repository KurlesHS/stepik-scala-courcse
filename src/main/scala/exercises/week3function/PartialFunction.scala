package exercises.week3function

import scala.math

object PartialFunction extends App {
  def chatbot(string: String) : Option[String] = {
    val aPartialFunction: PartialFunction[String, String] = {
      case "hello" => "Hi, I'm Bot"
      case "bye" => "Bye-bye"
      case "what's up" => "sup-sup"
    }
    val aPartialFunctionLifted = aPartialFunction.lift
    aPartialFunctionLifted(string)
  }

  println(chatbot("hello"))
  println(chatbot("bye"))
  println(chatbot("what's up"))
  println(chatbot("what's up2"))


  val s : List[String] = List("hello", "bye", "what's up", "what's up!")
  s.map(x=>chatbot(x)).foreach(x => println(x))


  def compare(v1: String, v2: String): Int = {
    def split(s: String) : List[Int] = {
      def go(list: List[Int]) : List[Int] = {
        if (list.size > 1 && list.last == 0) {
          go(list.take(list.length - 1))
        } else {
          list
        }
      }
      go(s.split('.').toList.map(x => x.toInt))
    }
    val v11 = split(v1)
    val v12 = split(v2)
    val z = v11.zipAll(v12, 0, 0)
    val maxIdx = math.min(v11.length, v12.length)
    for (idx <- 0 until maxIdx) {
      if (v11(idx) < v12(idx)) {
        return -1
      }
      if (v11(idx) > v12(idx)) {
        return 1
      }
    }
    if (v11.length == v12.length) {
      return 0
    }
    if (v11.length > v12.length) {
      return  1
    }
    -1
  }
  println(compare("0.9", "1.0"))
  println(compare("0.9", "0.9"))
  println(compare("0.9", "0.9.1"))
  println(compare("0.9.1", "0.9"))

  // println(r)

}
