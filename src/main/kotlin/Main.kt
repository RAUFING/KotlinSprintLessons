package org.example

fun main() {
    println("Сколько секунд вы хотите засечь?")
    val userSeconds = readln().toInt()

    Thread.sleep(userSeconds * 1000L)

    println("Прошло $userSeconds секунд")
}
