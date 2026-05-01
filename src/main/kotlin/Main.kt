package org.example

fun main() {
    val number1 = 12
    val number2 = 56

    println("Введите первое число:")
    val userNumber1 = readln().toInt()
    println("Введите второе число:")
    val userNumber2 = readln().toInt()

    val guessedFirst = userNumber1 == number1 || userNumber1 == number2
    val guessedSecond = userNumber2 == number1 || userNumber2 == number2

    if (guessedFirst && guessedSecond) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (guessedFirst || guessedSecond) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Для победы нужно было угадать числа: $number1 и $number2")
}
