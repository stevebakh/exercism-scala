object Hamming {
  def compute(first: String, second: String): Option[Int] = 
    if (first.size != second.size) None
    else Some(first.zip(second).count(p => p._1 != p._2))
}
