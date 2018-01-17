class Bob {
  def hey(input: String): String = {
    if (input.trim.isEmpty) "Fine. Be that way!"
    else if (input.exists(_.isLetter) && input.toUpperCase == input) "Whoa, chill out!" 
    else if (input.endsWith("?")) "Sure."
    else "Whatever."
  }
}
