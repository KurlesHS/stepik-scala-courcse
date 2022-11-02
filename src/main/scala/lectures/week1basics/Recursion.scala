package lectures.week1basics

object Recursion extends App {
def powerOfTwo(v : Int) : BigInt = {
  def loop(v : Int, acc : BigInt = 1) : BigInt = {
    if (v == 0) {
      return acc
    }
    loop(v - 1, acc * 2)
  }
  loop(v)
}

  def task_two(x :Int, y : Int, n : Int) : Int = {
    def loop(n : Int, acc : Int = x): Int = {
      if (n == 0) return acc
      return loop(n - 1, acc + y)
    }
    return loop(n)
  }

  def task_two_2(v : Int, n : Int, acc :String) : String = {
    if (n <= 1) {
      return acc
    }
    return task_two_2(v, n - 1, s"$acc $v")
  }

  val fArgs = Array[Int](10,1, 5)
  val x = fArgs(0)
  val y = fArgs(1)
  val n = fArgs(2)

  val res1 = task_two(x, y, n)
  val cnt = res1.toString.length

  println(s"${task_two_2(res1, cnt, s"$res1")} is the result")




  println(task_two(x, y, n))

}
