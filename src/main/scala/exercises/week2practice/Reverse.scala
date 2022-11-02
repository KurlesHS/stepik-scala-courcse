package exercises.week2practice

object Reverse extends App {
  def reverseStr(str: String) : String = {
    def go(str: String, acc: String) : String = {
      if (str.isEmpty) acc else go(str.takeRight(str.length - 1), s"${str(0)}$acc")
    }
    return go(str, "")
  }

  println(reverseStr("Hello"))
  println("Hello2".reverse)
  val str = "Hello, World!"
  def revPartOfString(str: String, fromIdx : Int, toIdx : Int) : String =
    str.slice(0, fromIdx) ++ str.slice(fromIdx, toIdx).reverse ++ str.slice(toIdx, str.length)

  println(str.substring(0, 1) ++ str.substring(1, 6).reverse ++ str.substring(6))
  println(revPartOfString(str, 1, 6))

}
