object Squares {
  private def square(n: Int) = math.pow(n, 2).toInt
  
  def squareOfSums(n: Int): Int = square((1 to n).sum)

  def sumOfSquares(n: Int): Int = (1 to n).map(square).sum

  def difference(n: Int): Int = squareOfSums(n) - sumOfSquares(n)
}
