case class Year(year: Int) {
  lazy val isLeap: Boolean = 
    year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0)
}

