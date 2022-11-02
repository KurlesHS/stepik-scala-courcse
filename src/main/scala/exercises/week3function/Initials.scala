package exercises.week3function
import scala.io.StdIn.readLine

object Initials extends App {
  val nameSurname = readLine
  val regexp = "^(\\w)\\w*\\s(\\w)\\w*$".r
  val res = nameSurname match {
    case regexp(name, surname) => s"$name. $surname."
    case _ => "Oops, something is wrong"
  }
  println(res)
}
