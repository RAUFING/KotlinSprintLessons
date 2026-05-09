package org.example

class User(
    val id: Long,
    val login: String,
    val password: String,
    val email: String,)

fun main() {
    val user1 = User(
        id = 1,
        login = "android_dev",
        password = "qwerty123",
        email = "android@example.com",
    )
    val user2 = User(
        id = 2,
        login = "kotlin_fan",
        password = "securePass!",
        email = "kotlin@example.com",
    )

    println("ID: ${user1.id}, Логин: ${user1.login}, Пароль: ${user1.password}, Почта: ${user1.email}")
    println("ID: ${user2.id}, Логин: ${user2.login}, Пароль: ${user2.password}, Почта: ${user2.email}")
}