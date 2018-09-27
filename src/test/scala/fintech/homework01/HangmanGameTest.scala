package fintech.homework01

import org.scalatest._
import org.scalatest.prop.TableDrivenPropertyChecks._

class HangmanGameTest extends FlatSpec with Matchers {

  class HangmanGameMove(val word: String, val stage: Int, val status: HangmanGameStatus.State, val guessedLetter: Char)

  val testCases =
    Table(
      ("word", "moves"),

      ("abc", Array(
        new HangmanGameMove("___", 0, HangmanGameStatus.Started, 'a'),
        new HangmanGameMove("a__", 0, HangmanGameStatus.Started, 'b'),
        new HangmanGameMove("ab_", 0, HangmanGameStatus.Started, 'c'),
        new HangmanGameMove("abc", 0, HangmanGameStatus.Completed, '_')
      )),

      ("aba", Array(
        new HangmanGameMove("___", 0, HangmanGameStatus.Started, 'a'),
        new HangmanGameMove("a_a", 0, HangmanGameStatus.Started, 'b'),
        new HangmanGameMove("aba", 0, HangmanGameStatus.Completed, '_')
      )),

      ("ab", Array(
        new HangmanGameMove("__", 0, HangmanGameStatus.Started, 'z'),
        new HangmanGameMove("__", 1, HangmanGameStatus.Started, 'y'),
        new HangmanGameMove("__", 2, HangmanGameStatus.Started, 'b'),
        new HangmanGameMove("_b", 2, HangmanGameStatus.Started, 'x'),
        new HangmanGameMove("_b", 3, HangmanGameStatus.Started, 'a'),
        new HangmanGameMove("ab", 3, HangmanGameStatus.Completed, '_'),
      )),

      ("a", Array(
        new HangmanGameMove("_", 0, HangmanGameStatus.Started, 'z'),
        new HangmanGameMove("_", 1, HangmanGameStatus.Started, 'z'),
        new HangmanGameMove("_", 2, HangmanGameStatus.Started, 'z'),
        new HangmanGameMove("_", 3, HangmanGameStatus.Started, 'z'),
        new HangmanGameMove("_", 4, HangmanGameStatus.Started, 'z'),
        new HangmanGameMove("_", 5, HangmanGameStatus.Started, 'z'),
        new HangmanGameMove("_", 6, HangmanGameStatus.Started, 'z'),
        new HangmanGameMove("_", 7, HangmanGameStatus.Started, 'z'),
        new HangmanGameMove("_", 8, HangmanGameStatus.Failed, '_'),
      ))
    )

  forAll(testCases) { (word: String, moves: Array[HangmanGameMove]) =>
    val game = new HangmanGame(word)

    for (move <- moves) {
      game.getWord() should be(move.word)
      game.getStatus() should be(move.status)
      game.getStage().number should be(move.stage)
      if (move.status == HangmanGameStatus.Started)
        game.guessLetter(move.guessedLetter)
    }
  }
}