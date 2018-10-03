package fintech.homework01

class HangmanGameStage(val currentStage: Int) {
  private val stagesCount = 8

  def getNumber(): Int = currentStage

  def isLast(): Boolean = currentStage == stagesCount

  def next(): HangmanGameStage = {
    if (isLast)
      throw new Exception("Invalid operation. Current stage is last.")
    new HangmanGameStage(currentStage + 1)
  }
}
