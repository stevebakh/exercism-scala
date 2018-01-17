class Phrase(text: String) {
  def wordCount: Map[String, Int] = 
    text.toLowerCase.split("[^\\w']+").groupBy(identity).mapValues(_.size)
}
