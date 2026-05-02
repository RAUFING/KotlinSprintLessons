package org.example

fun main() {
    println("Сколько секунд вы хотите засечь?")
    var userSeconds = readln().toInt()

    while (userSeconds > 0) {
        println("Осталось секунд: $userSeconds")
        Thread.sleep(1000)
        userSeconds--
    }

    println("Время вышло")
}
