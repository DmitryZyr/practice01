package fintech.homework01

class Hangman(io: IODevice) {
  def play(word: String): Unit = {
    val game = new HangmanGame(word)
    while (game.getStatus() == HangmanGameStatus.Started) {
      io.printLine("Word: " + game.getWord())
      io.printLine("Guess a letter:")
      val letter = io.readChar()
      game.guessLetter(letter)
      val stage = game.getStage()
      if (stage.number != 0)
        io.printLine(stage.toString)
    }
    io.printLine(if (game.getStatus() == HangmanGameStatus.Failed) s"You are dead. The word was $word" else s"You guessed the word $word")
  }
}