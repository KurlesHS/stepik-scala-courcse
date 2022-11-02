package lectures.week2oop

object Tasks3_1 extends App {
  // здесь пропущена строка кода

  class Instructor(val id :Int, val name : String,val  surname : String) {
    def fullName(): String = {
      def helper(s: String): String = {
        s(0).toUpper + s.substring(1)
      }

      helper(name) + " " + helper(surname)
    }
  }

  class Course(val courseID : Int, val title : String, val releaseYear : String, val instructor : Instructor) {
    def getID() : String = courseID.toString + instructor.id.toString
    def isTaughtBy(instructor: Instructor) : Boolean = this.instructor.id == instructor.id
    def copyCourse(newReleaseYear : String) :  Course = new Course(courseID, title,newReleaseYear, instructor)
  }

  val instructor: Instructor = new Instructor(1, "вася", "пупкин")
  println(instructor.fullName()) // Вася Пупкин

  val course: Course = new Course(2, "Course Name", "1234", instructor)
  println(course.instructor.fullName()) // Вася Пупкин
  println(course.getID) // 21
  println(course.isTaughtBy(instructor)) // true
  println(course.isTaughtBy(new Instructor(1, "Вася", "Пупкин"))) // false

  println(course.copyCourse("4321").releaseYear) // 4321

}
