// 1. Объявите и напечатайте на экране значение типа Int

val i: Int = 2
println(i)

// 2 Объявите Int, но не указывайте тип. Как вы можете понять что полученое значение это Int?

val n = 3
println(n.getClass)

// 3. Попробуйте присвоить n новое значение. Что получилось? Почему?
//n = 4

// 4. Объявите и напечатайте Double.
val double = 2.3
val double2:Double = 3
// Указывали ли вы тип или положились на компилятор?
// Объявите другой Double использовав другой вариант

// 5. Объявите и напечатайте *переменную* (var) типа Int.
var a = 1
println(a)
a = 2
print(a)
//a = 2.3
// Попробуйте изменить значение. Получилось?
// Попробуйте присвоить совей переменной значение типа Double
// Получилось? Почему?

// 6. Объявите многострочную строку используя """ и выведете ее на экран
val str =
  """
    |add
    |remove
    |mul
  """.stripMargin
print(str)
// 7. Ниже представлен код для вычисления моего BMI (индекс массы тела)
// Перепишите его так чтобы использовался только один println

{
  val mass = 81.0
  val height = 1.81

  val bmi = mass / (height * height)

  val result =
    if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
  println(result)
//  if(bmi < 18.5) println("Underweight")
//  else if(bmi < 25) println("Normal weight")
//  else println("Overweight")
}

// 8. Посчитайте какой у меня должен быть "идеальный вес"
// (Вес при котором bmi == 22)
{
  val height = 1.81
  val idealWeight = 22 * (height * height)
  println("idealWeight " + idealWeight)
}
