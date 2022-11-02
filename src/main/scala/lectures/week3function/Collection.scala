package lectures.week3function

object Collection extends App {
  val progLanguages = List("java", "scala", "python")
  val lngAbbrev = List("JA", "SCA", "PY")
  val x = for {
    lng <- progLanguages
    abrv <- lngAbbrev
  } yield (abrv, lng)

  println(x)

  val out = for(idx <- progLanguages.indices.toList) yield (lngAbbrev(idx), progLanguages(idx))
  println(out)
  val sampleTuple = new Tuple2(2, "Hello, World")
  println(sampleTuple.copy(_2 = "Scala").swap._1 + 5)

  val nums1 = List(1, 2, 3)
  val nums2 = List(4, 6, 7)
  val nums3 = List(10, 100, 1000)

  println(nums1.flatMap(a => nums2.flatMap(b => nums3.filter(_ % 2 == 1).map(c => (a + b) * c))))
  println(for {
    a <- nums1
    b <- nums2 if b % 2 == 1
    c <- nums3
  } yield (a + b) * c)
  println(nums1.flatMap(a => nums2.filter(_ % 2 == 1).flatMap(b => nums3.map(c => a + b * c))))
  println(
    nums1.flatMap(a => nums2.filter(_ % 2 == 1).flatMap(b => nums3.map(c => (a + b) * c))))
  println(
    for {
      a <- nums1
      b <- nums2
      c <- nums3
    } yield (a + b) * c)

  val someVal = Some(2)
  println(someVal.map(_ * 2))
}
