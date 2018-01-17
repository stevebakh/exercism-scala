class PhoneNumber(raw: String) {
  def areaCode: Option[String] = number.map(_.take(3))
  
  def prettyPrint: Option[String] = number.map { n =>
    "(%s) %s-%s".format(n.take(3), n.substring(3, 6), n.takeRight(4))
  }
  
  def number: Option[String] = {
    Option(raw.filter(_.isDigit)).filter(_.nonEmpty) match {
      case Some(n) if n.size == 10 => Some(n)
      case Some(n) if n.head == '1' && n.size == 11 => Some(n.takeRight(10))
      case _ => None
    }
  }
}
