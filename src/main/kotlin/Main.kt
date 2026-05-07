package org.example

const val MIN_LENGTH = 4
fun isValidLength(input: String): Boolean = input.length >= MIN_LENGTH
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