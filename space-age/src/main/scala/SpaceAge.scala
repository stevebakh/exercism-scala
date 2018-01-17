case class SpaceAge(seconds: Long) {
  lazy val onEarth: Double = convertAndRound(earthYears)
  lazy val onMercury: Double = convertAndRound(earthYears / 0.2408467)
  lazy val onVenus: Double = convertAndRound(earthYears / 0.61519726)
  lazy val onMars: Double = convertAndRound(earthYears / 1.8808158)
  lazy val onJupiter: Double = convertAndRound(earthYears / 11.862615)
  lazy val onSaturn: Double = convertAndRound(earthYears / 29.447498)
  lazy val onUranus: Double = convertAndRound(earthYears / 84.016846)
  lazy val onNeptune: Double = convertAndRound(earthYears / 164.79132)
  
  private lazy val earthYears: BigDecimal = (BigDecimal(seconds) / 31557600)
  
  private def convertAndRound(years: BigDecimal): Double = 
    years.setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}
