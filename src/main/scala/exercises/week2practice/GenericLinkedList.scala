package exercises.week2practice

object GenericLinkedList extends App {
  abstract class LogList[+A] {
    def last: A

    def previous: LogList[A]

    def isEmpty: Boolean

    def all: String

    def add[B >: A](msg: B): LogList[B]
  }

  object Empty extends LogList[Nothing] {
    override def last: Nothing = throw new NoSuchElementException

    override def previous: LogList[Nothing] = throw new NoSuchElementException

    override def isEmpty: Boolean = true

    override def all: String = ""

    override def add[A](msg: A): LogList[A] = new Log(msg, Empty)
  }

  class Log[+A](head: A, tail: LogList[A]) extends LogList[A] {
    override def last: A = head

    override def previous: LogList[A] = tail

    override def isEmpty: Boolean = false

    override def all: String = {
      def go(logList: LogList[A], acc: String): String = {
        if (logList.isEmpty) acc else {
          go(logList.previous, s"${acc.toString} ${logList.last.toString}")
        }
      }

      go(this, "").trim
    }

    override def add[B >: A](msg: B): LogList[B] = new Log[B](msg, this)
  }

  val list = new Log[String]("INFO_1", new Log("INFO_2", new Log("INFO_3", Empty)))
  val list2 = new Log[Int](1, new Log(2, new Log(3, Empty)))

  println(list.previous.last)
  println(list.all)

  println(list2.previous.last)
  println(list2.all)
}
