package exercises.week2oop

object Button extends App {
  class Button(val label : String) {
    def this() = this("test")
    def click() = s"button -$label- has been clicked"
  }

  class RoundedButton (override val label: String) extends Button(label) {
    override def click(): String = s"rounded ${super.click()}"
  }

  val r = new RoundedButton("hello")
  println(r.click())
}
