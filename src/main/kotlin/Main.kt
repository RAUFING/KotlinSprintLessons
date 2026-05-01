package org.example

const val CORRECT_ANSWER = 4

fun main() {
    println("Уважаемый пользователь! Докажите что вы не бот. Решите пример: 2+2")
    val input = readln().toInt()
    if (input == CORRECT_ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
