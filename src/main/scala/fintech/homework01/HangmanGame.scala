package fintech.homework01

import scala.collection.mutable

class HangmanGame(word: String) {
  private var gameStatus = HangmanGameStatus.Started
  private var stage = new HangmanGameStage(0)
  private val guessedLetters : mutable.Set[Char] = mutable.Set()
  private val countLetters = word.groupBy(x => x).size

  def getStatus: HangmanGameStatus.State = gameStatus

  def guessLetter(letter: Char) : Unit = {
    if (word.contains(letter)) {
      guessedLetters += letter
      if (guessedLetters.size == countLetters)
        gameStatus = HangmanGameStatus.Completed
    } else {
      stage = stage.next()
      if (stage.isLast())
        gameStatus = HangmanGameStatus.Failed
    }
  }

  def getWord : String = {
    for (letter <- word)
      yield if (guessedLetters.contains(letter)) letter else '_'
  }

  def getStage: HangmanGameStageView = new HangmanGameStageView(stage.getNumber())
}
