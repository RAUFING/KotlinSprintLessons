package org.example

fun main() {
    val number1 = 2
    val number2 = 2
    val correctAnswer = number1 + number2
    println("Уважаемый пользователь! Докажите что вы не бот. Решите пример: $number1 + $number2")
    val input = readln().toInt()
    if (input == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
