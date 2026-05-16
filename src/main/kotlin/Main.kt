package org.example

class User(val login: String, private val password: String) {
    fun validatePassword(input: String): Boolean = input == password
}
