package org.example

fun generatePassword(length: Int): String {
    val digits = "0123456789"
    val specialChars = "!\"#$%&'()*+,-./ "
    val password = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            password.append(digits.random())
        } else {
            password.append(specialChars.random())
        }
    }

    return password.toString()
}

fun main() {
    println("Введите длину пароля:")
    val length = readln().toInt()
    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}