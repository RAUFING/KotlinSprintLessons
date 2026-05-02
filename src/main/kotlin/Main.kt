package org.example

fun main() {
    println("Угадай число от 1 до 9")
    val number = (1..9).random()
    var attempts = 5

    while (attempts > 0) {
        println("Введите число:")
        val guess = readln().toInt()
        attempts--
        if (guess != number) {
            println("Неверно, осталось попыток: $attempts")
        } else {
            println("Это была великолепная игра!")
            return
        }
    }

    println("Было загадано число $number")
}
