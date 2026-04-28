package org.example

fun main() {
    val tables = 13
    val todayBook = 13
    val tomorrowBook = 9
    println("Доступность столиков на сегодня: ${todayBook < tables}")
    println("Достпуность столиков на завтра: ${tomorrowBook < tables}")
}