object Grains {
  lazy val total: BigInt = (1 to 64).flatMap(square).sum
  
  def square(exponent: Int): Option[BigInt] = exponent match {
    case n if n < 1 || n > 64 => None
    case _ => Some(BigInt(1) << (exponent-1))
  }
}
