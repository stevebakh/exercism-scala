import scala.collection.immutable.SortedMap

class School {
  private var students = SortedMap[Int, Seq[String]]()

  def db: Map[Int, Seq[String]] = students

  def grade(gradeNumber: Int): Seq[String] = 
    students.get(gradeNumber).getOrElse(Seq())

  def sorted: Map[Int, Seq[String]] = students.mapValues(_.sorted)

  def add(name: String, gradeNumber: Int): Unit = 
    students += (gradeNumber -> (grade(gradeNumber) :+ name))
}
