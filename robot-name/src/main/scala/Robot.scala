class Robot {
  private var generatedName = Robot.randomName
  
  def name: String = generatedName

  def reset(): Unit = generatedName = Robot.randomName
}

object Robot {
  import scala.util.Random

  protected def randomName: String = {
    val name = availableNames.head
    availableNames = availableNames.tail
    name
  }

  private var availableNames = Random.shuffle(for {
    a <- 'A' to 'Z'
    b <- 'A' to 'Z'
    c <- 0 to 9
    d <- 0 to 9
    e <- 0 to 9
  } yield "%s%s%d%d%d".format(a, b, c, d, e)).toIndexedSeq
}
