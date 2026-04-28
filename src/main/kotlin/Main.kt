package org.example

const val TABLES = 13

fun main() {
    val todayBook = 13
    val tomorrowBook = 9
    println("[Доступность столиков на сегодня: ${todayBook < TABLES}]\n[Доступность столиков на завтра: ${tomorrowBook < TABLES}]")
}