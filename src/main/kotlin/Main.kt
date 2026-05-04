package org.example

const val MIN_PASSWORD_LENGTH = 6

fun main() {
    println("Введите длину пароля (минимум $MIN_PASSWORD_LENGTH символов):")
    val length = readln().toIntOrNull() ?: MIN_PASSWORD_LENGTH
    val passwordLength = if (length < MIN_PASSWORD_LENGTH) MIN_PASSWORD_LENGTH else length

    val digits = '0'..'9'
    val lowercaseLetters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'
    val allSymbols = digits + lowercaseLetters + uppercaseLetters

    var password = ""

    password += digits.random()
    password += lowercaseLetters.random()
    password += uppercaseLetters.random()

    for (i in 4..passwordLength) {
        password += allSymbols.random()
    }

    val shuffledPassword = password.toList().shuffled().joinToString("")
    println("Ваш пароль: $shuffledPassword")
}
