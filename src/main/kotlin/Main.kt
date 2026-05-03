package org.example

fun main() {
    while (true) {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        val userInput = readln().toInt()
        if (userInput == code) {
            println("Добро пожаловать!")
            break
        }
    }
}
