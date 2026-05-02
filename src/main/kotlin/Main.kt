package org.example

fun main() {
    var attempts = 3

    while (attempts > 0) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()
        println("Решите пример: $number1 + $number2")
        val userAnswer = readln().toInt()

        if (userAnswer == number1 + number2) {
            println("Добро пожаловать!")
            return
        } else {
            attempts--

            if (attempts > 0) {
                println("Неверно, осталось попыток: $attempts")
            }
        }
    }

    println("Доступ запрещен")
}
