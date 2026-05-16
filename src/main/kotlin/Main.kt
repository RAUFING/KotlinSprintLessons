package org.example

class User(private val login: String, private val password: String) {
    fun validatePassword(input: String): Boolean = input == password
}

fun main() {
    val user = User("rauf", "qwerty123")
    println(user.validatePassword("wrong"))
    println(user.validatePassword("qwerty123"))
}