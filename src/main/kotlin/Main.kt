package org.example

const val TABLES = 13

fun main() {
    val todayBookedTables = 13
    val tomorrowBookedTables = 9
    println("[Доступность столиков на сегодня: ${todayBookedTables < TABLES}]\n[Доступность столиков на завтра: ${tomorrowBookedTables < TABLES}]")
}