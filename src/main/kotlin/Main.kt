package org.example

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2026
    val input = readln().toInt()
    val age = currentYear - input
    if (age >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ ограничен")
    }
}
