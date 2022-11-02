package lectures.week1basics

object StringOperations {
  def main(args: Array[String]) = {
    val aString: String = "Hello, world!"

    println(aString.length) // выводит 13
    println(aString.charAt(1)) // выводит e
    println(aString.substring(0, 2)) // выводит He
    println(aString.split(" ").toList) // выводит List(Hello,, world!)
    println(aString.startsWith("He")) // выводит true
    println(aString.replace("!", ".")) // выводит Hello, world.
    println(aString.toLowerCase) // выводит hello, world!
    println(aString.toUpperCase) // выводит HELLO, WORLD!
    println("abcd".reverse) // выводит dcba
    println("abcd".take(2)) // выводит ab

    {
      val aString = "Scala course"
      println("------")
      /*
      println(aString.take(5))
      println(aString.take(-1))
      println(aString.charAt(11))
      println(aString.take(12))
      println(aString.substring(11, 12))
       */

      {
        val aString = "Scala course"
        println(aString.replace("a", "").take(3).reverse)
      }

      {
        val link = "https://stepik.org"
        println(link :++ "/catalog")
        println(s"The link is $link.toUpperCase")
        println(s"The link is ${link.toUpperCase}")
        // println(link :+ '/catalog')
        println(raw"The link is \t $link")
      }



    }

  }
}
