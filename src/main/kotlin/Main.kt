package org.example

fun main() {
    println("Сколько секунд вы хотите засечь?")
    val userSeconds = readln().toInt()
    var remainingSeconds = userSeconds

    while (remainingSeconds > 0) {
        remainingSeconds--
        Thread.sleep(1000)
    }

    println("Прошло $userSeconds секунд")
}
