package lectures.week3function

object Function extends App {

  val strlen = (str: String) => str.length // напишите функцию здесь
  println(strlen("hellp"))


  def someFunc: Int => Function1[Int, Int] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }
  val res = someFunc(1)
  println(res)
  println(res(4))
  println(someFunc(3)(4))
}
