package org.example

fun isValidLength(input: String): Boolean {
    return input.length >= 4
}

fun main() {
    println("Придумайте логин:")
    val login = readln()
    println("Придумайте пароль:")
    val password = readln()

    if (isValidLength(login) && isValidLength(password)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}