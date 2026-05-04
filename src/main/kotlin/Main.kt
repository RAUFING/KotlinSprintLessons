package org.example

fun main() {
    println("Введите длину пароля (минимум 6 символов):")
    val length = readln().toInt()
    val passwordLength = if (length < 6) 6 else length

    val digits = '0'..'9'
    val lowercaseLetters = 'a'..'z'
    val uppercaseLetters = 'A'..'Z'
    val allSymbols = (digits + lowercaseLetters + uppercaseLetters).toList()

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
