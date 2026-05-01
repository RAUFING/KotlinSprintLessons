package org.example

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2026
    val yearBorn = readln().toInt()
    val age = currentYear - yearBorn
    if (age >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ ограничен")
    }
}
