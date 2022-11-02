package lectures.week3function

object Collection extends App {
  val progLanguages = List("java", "scala", "python")
  val lngAbbrev = List("JA", "SCA", "PY")
  val x = for {
    lng <- progLanguages
    abrv <- lngAbbrev
  } yield (abrv, lng)

  println(x)

}
