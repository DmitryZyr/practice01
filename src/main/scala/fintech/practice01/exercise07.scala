package fintech.practice01

import scala.io.StdIn
import scala.util.Random

// Используйте while чтобы добавить в свою игру возможность играть несколько раз
// (спрашивайте у игрока хочет ли он сыграть еще раз)

object Exercise07 {
  def main(args: Array[String]): Unit = {
    do {
      print("Enter a number: ")
      val userNumber = StdIn.readLine()
      val randomNumber = new Random().nextInt()
      val isSuccess = randomNumber.toString == userNumber
      val result = if (isSuccess) "You guessed number" else s"You did not guess the number: $randomNumber"
      println(result)
      if (isSuccess)
        return
      println("Try one more (y/any key)? ")
    } while (StdIn.readLine() == "y")
  }
}
