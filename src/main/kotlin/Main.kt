package org.example

fun main() {
    println("Введите кол-во секунд, которое надо засечь:")

    val userSeconds = readln().toInt()
    for (i in userSeconds downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }

    println("Время вышло")
}
