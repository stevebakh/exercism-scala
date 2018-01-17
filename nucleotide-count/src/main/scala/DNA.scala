class DNA(strand: String) {
  def count(nucleotide: Char): Either[String, Int] =
    nucleotideCounts.right.flatMap { counts =>
      counts.get(nucleotide).map(Right(_)).getOrElse(Left(s"invalid nucleotide '$nucleotide'"))
    }

  def nucleotideCounts: Either[String, Map[Char, Int]] =
    strand.find(!"ATCG".contains(_)).map(n => Left(s"invalid nucleotide '$n'")).getOrElse { 
      Right("ATCG".map(n => (n, strand.count(_ == n))).toMap)
    } 
}
