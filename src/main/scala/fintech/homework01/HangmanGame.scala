package fintech.homework01

import scala.collection.mutable

class HangmanGame(word: String) {
  private var gameStatus = HangmanGameStatus.Started
  private val stage = new HangmanGameStage
  private val guessedLetters : mutable.HashMap[Char, Boolean] = mutable.HashMap()
  private val countLetters = word.groupBy(x => x).size

  def getStatus(): HangmanGameStatus.State = gameStatus

  def guessLetter(letter: Char) : Boolean = {
    if (word.contains(letter)) {
      guessedLetters += (letter -> true)
      if (guessedLetters.size == countLetters)
        gameStatus = HangmanGameStatus.Completed
      true
    } else {
      stage.next()
      if (stage.isLast())
        gameStatus = HangmanGameStatus.Failed
      false
    }
  }

  def getWord() : String = {
    val currentWord = new StringBuilder
    for (letter <- word) {
      currentWord += (if (guessedLetters.contains(letter)) letter else '_')
    }
    currentWord.toString
  }

  def getStage(): HangmanGameStageView = new HangmanGameStageView(stage.getNumber())
}
