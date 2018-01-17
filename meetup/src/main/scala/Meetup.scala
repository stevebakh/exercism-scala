import java.util.Calendar
import java.util.Calendar._
import java.util.GregorianCalendar
import scala.annotation.tailrec

case class Meetup(month: Int, year: Int) {
  import Meetup._

  def teenth(day: Day): Calendar = dateOfDay(day, (13 to 19))
  
  def first(day: Day): Calendar  = dateOfDay(day, (1 to 7))
  
  def second(day: Day): Calendar = dateOfDay(day, (8 to 14))
  
  def third(day: Day): Calendar  = dateOfDay(day, (15 to 21))
  
  def fourth(day: Day): Calendar = dateOfDay(day, (22 to 28))
  
  def last(day: Day): Calendar = {
    val daysInMonth = new GregorianCalendar(year, month - 1, 1).getActualMaximum(DATE)
    dateOfDay(day, (daysInMonth - 6 to daysInMonth))
  }

  @tailrec
  private def dateOfDay(day: Day, candidateDates: Seq[Int]): Calendar = {
    val cal = new GregorianCalendar(year, month - 1, candidateDates.head)
    cal.get(DAY_OF_WEEK) match {
      case day.number => cal
      case _ => dateOfDay(day, candidateDates.tail)
    }
  }
}

object Meetup {
  sealed abstract class Day(val number: Int)
  case object Mon extends Day(MONDAY)
  case object Tue extends Day(TUESDAY)
  case object Wed extends Day(WEDNESDAY)
  case object Thu extends Day(THURSDAY)
  case object Fri extends Day(FRIDAY)
  case object Sat extends Day(SATURDAY)
  case object Sun extends Day(SUNDAY)
}

