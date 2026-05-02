package org.example

fun main() {
    println("Придумайте логин:")
    val login = readln()
    println("Придумайте пароль:")
    val password = readln()
    println("Отлично, теперь войдите")
    while (true) {
        println("Введите логин:")
        val inputLogin = readln()
        println("Введите пароль:")
        val inputPassword = readln()
        if (inputLogin == login && inputPassword == password) {
            break
        } else {
            println("Данные не верны, попробуйте еще раз")
        }
    }
    println("Авторизация прошла успешно")
}
