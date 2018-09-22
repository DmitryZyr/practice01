// 1. Объявите List содержаший Int

val ints = List(1, 2, 3, 4, 5)

// 2. Объявите List содержащий String

val strings = List("1", "2", "3")

// 3. Объявите List содержащий вперемешку Int и String.
// Какого типа получился List? Почему?

val intsAndStrings = List("1", 1, "2", 2)

// 4. Попробуйте объявить List содержащий другие List'ы

val listOfLists = List(List(1,2), List(3, 4))

// 5. Объявите List со словами (String)
// Используйте var и for чтобы сделать из слов предложение
// Выведите его на экран

val words = List("all", "your", "base", "are", "belong", "to", "us")
var sentence = ""
for (word <- words)
  sentence += s"$word "
println(sentence)

// 6. Используйте метод mkString чтобы сделать тоже предложение

val sentence2 = words.mkString(" ")

// 7. Используя for выведите слова в обратном порядке

var sentence3= ""
for (word <- words)
  sentence3 = s"$word " + sentence3
println(sentence3)

// 8. Объявите List содержащий Double
// Используйте .map и lambda-синтаксис чтобы возвести элементы списка в квадрат

List(1.1, 2.2).map(x => x * x)

// 9. Используйте var и for чтобы посчитать сумму квадратов

var result = 0
for (i <- 1 to 10)
  result += i * i
println(result)

// 10. Используйте .sum метод чтобы посчитать сумму квадратов

(1 to 0).map(x => x * x).sum

// 11. Используйте var, for и класс Range чтобы посчитать сумму чисел от 1 до 10

var sum = 0
for (i <- Range(1, 10))
  sum += i * i
println(sum)