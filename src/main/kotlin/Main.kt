package org.example

fun main() {
    println("Придумайте логин:")
    val login = readln()
    println("Придумайте пароль:")
    val password = readln()
    println("Отлично, теперь войдите")

    var inputLogin: String
    var inputPassword: String

    do {
        println("Введите логин:")
        inputLogin = readln()
        println("Введите пароль:")
        inputPassword = readln()

        if (inputLogin != login || inputPassword != password) {
            println("Данные не верны, попробуйте еще раз")
        }
    } while (inputLogin != login || inputPassword != password)

    println("Авторизация прошла успешно")
}
