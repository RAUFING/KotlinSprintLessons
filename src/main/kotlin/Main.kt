package org.example

fun main() {
    var code: Int
    var userInput: Int

    do {
        code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        userInput = readln().toInt()
    } while (userInput != code)

    println("Добро пожаловать!")
}
