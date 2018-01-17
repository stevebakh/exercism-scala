class Anagram(word: String) {
  def matches(candidateWords: Seq[String]): Seq[String] = 
    candidateWords.filter { candidate => 
      word.toLowerCase != candidate.toLowerCase && 
      candidate.length == word.length &&
      candidate.toLowerCase.diff(word.toLowerCase).isEmpty
    }
}
