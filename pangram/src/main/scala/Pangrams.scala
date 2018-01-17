object Pangrams {
  def isPangram(text: String): Boolean =
    ('a' to 'z').forall(text.toLowerCase.contains(_))
}
