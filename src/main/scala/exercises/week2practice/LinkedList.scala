package exercises.week2practice

object LinkedList extends App {
  abstract class LogList {
    def last : String
    def previous : LogList
    def isEmpty : Boolean
    def all : String
    def add(msg : String) : LogList
  }

  object Empty extends LogList {
    override def last: String = throw new NoSuchElementException
    override def previous: LogList = throw new NoSuchElementException
    override def isEmpty: Boolean = true
    override def all: String = ""
    override def add(msg: String) : LogList = new Log(msg, Empty)
  }

  class Log (head: String, tail: LogList) extends LogList {
    override def last: String = head
    override def previous: LogList = tail
    override def isEmpty: Boolean = false
    override def all: String = {
      def go(logList: LogList, acc : String) : String = {
        if (logList.isEmpty) acc else {
          go (logList.previous, s"$acc ${logList.last}")
        }
      }
      go(this, "").trim
    }
    override def add(msg: String): LogList = new Log(msg, this)
  }

  val list = new Log("INFO_1", new Log("INFO_2", new Log("INFO_3", Empty)))

  println(list.previous.last)
  println(list.all)

}
