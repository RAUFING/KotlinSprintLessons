package org.example

class User2(
    val id: Long,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {
    fun printInfo() {
        println("ID: $id")
        println("Логин: $login")
        println("Пароль: $password")
        println("Почта: $email")
        println("О себе: ${bio ?: "не указано"}")
    }

    fun changeBio() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен")
        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val me = User2(
        id = 1,
        login = "rauf",
        password = "old_secret",
        email = "rauf@example.com"
    )

    me.changeBio()
    me.changePassword()

    println("\nОбновленная информация:")
    me.printInfo()
}