package exercises.week3function

object Matchers extends App {
  def guard(data: Any, maxLength: Int): String = {
    val res = data match {
      case str: String => if (str.length > maxLength)
        "Получена строка недопустимой длины"
      else
        "Длина строки не превышает максимально допустимого значения"
      case lst@List(_*) => if (lst.length > maxLength)
        "Длина списка больше максимально допустимого значения"
      else
        "Задан список List допустимой длины"
      case _ => "Что это? Это не строка и не список"
    }
    res
  }

  println(guard("Hello", 4))
}
