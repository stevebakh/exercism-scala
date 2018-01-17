class Scrabble {
  private val Points = {
    "AEIOULNRST".map(_ -> 1) ++ 
    "DG".map(_ -> 2) ++ 
    "BCMP".map(_ -> 3) ++
    "FHVWY".map(_ -> 4) ++
    "K".map(_ -> 5) ++
    "JX".map(_ -> 8) ++
    "QZ".map(_ -> 10)
  }.toMap

  def scoreLetter(letter: Char): Int = Points(letter.toUpper)

  def scoreWord(word: String): Int = word.map(scoreLetter).sum
}
