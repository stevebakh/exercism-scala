object ETL {
  def transform(data: Map[Int, Seq[String]]): Map[String, Int] = data.flatMap { 
    case (points, values) => values.map(_.toLowerCase -> points)
  }
}
