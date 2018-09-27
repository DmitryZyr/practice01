package fintech.homework01

class HangmanGameStage {
  private var currentStage = 0
  private val stagesCount = 8

  def getNumber() : Int = currentStage

  def isLast() : Boolean = currentStage == stagesCount

  def next(): Unit = {
    if (isLast)
      throw new Exception("Invalid operation. Current stage is last.")
    currentStage += 1
  }
}
