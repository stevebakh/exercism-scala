import java.util.Calendar

case class Gigasecond(val from: Calendar) {
  lazy val date: Calendar = {
    val cal = from.clone.asInstanceOf[Calendar]
    cal.add(Calendar.SECOND, 1000000000)
    cal
  }
}
