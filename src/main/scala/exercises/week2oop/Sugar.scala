package exercises.week2oop

object Sugar extends App {
  class Person(val name : String) {
    def unary_+() : Person = new Person(s"${this.name} NoSurname")
  }
  val person = new Person("Bob")
  println((+person).name)



}
