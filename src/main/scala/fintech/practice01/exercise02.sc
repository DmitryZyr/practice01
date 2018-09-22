// 1. Напишите функцию, которая вычисляет квадрат Int

def square(x: Int): Int = x * x

// 2. Напишите функцию squareDouble, которая вычисляет квадрат Double

def squareDouble(x: Double): Double = x * x

// 3. На основе кода из exercise01.sc напишите функцию которая выводит
// Underweight/Normal weight/Overweight для переданных массы и роста

def printWeightBracket(mass: Double, height: Double): Unit = {
  val bmi = mass / (height * height)

  val result =
    if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
  println(result)
}

// 4. Перепишите функцию printWeightBracket выделив
// вычисление bmi и weightBracket в отдельные функции

def getBmi(mass: Double, height: Double): Double ={
  mass / (height * height)
}

def getWeightBracket(mass: Double, height: Double): String = {
  val bmi = getBmi(mass, height)

  if (bmi < 18.5) "Underweight"
  else if (bmi < 25) "Normal weight"
  else "Overweight"
}

println(getWeightBracket(100, 80))