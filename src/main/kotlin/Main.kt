package org.example

class User(
    initialLogin: String,
    initialPassword: String,
) {
    var login: String = initialLogin
        set(value) {
            field = value
            println("Логин успешно изменён")
        }

    var password: String = initialPassword
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = User("android_dev", "qwerty123")

    println("Логин: ${user.login}")
    println("Пароль: ${user.password}")

    println("\nПопытка сменить пароль...")
    user.password = "new_password"

    println("\nПопытка сменить логин...")
    user.login = "new_login"

    println("\nПосле попыток:")
    println("Логин: ${user.login}")
    println("Пароль: ${user.password}")
}