package org.example

fun main() {
    val omeletteForOne = listOf(2, 50, 15)
    println("Введите количество порций:")
    val portions = readln().toInt()

    println(
        "На $portions порций вам понадобится: " +
                "Яиц – ${omeletteForOne[0] * portions}, " +
                "молока – ${omeletteForOne[1] * portions}, " +
                "сливочного масла – ${omeletteForOne[2] * portions}"
    )
}