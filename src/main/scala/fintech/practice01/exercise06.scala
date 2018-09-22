package fintech.practice01

import scala.io.StdIn
import scala.util.Random

// Напишите консольную игру "угадай число"
// Используйте функцию StdIn.readLine() чтобы запросить ввод от пользователя
// и nextInt() из scala.util.Random для генерации случайных чисел

object Exercise06 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val userNumber = StdIn.readLine()
    val randomNumber = new Random().nextInt()
    val result = if (randomNumber.toString == userNumber) "You guessed number" else s"You did not guess the number: $randomNumber"
    println(result)
  }
}
