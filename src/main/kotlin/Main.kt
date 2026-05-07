package org.example

fun main() {
    val omeletteForOne = listOf(2, 50, 15)
    println("Введите количество порций:")
    val portions = readln().toInt()
    val neededIngredients = omeletteForOne.map { it * portions }

    println(
        "На $portions порций вам понадобится: " +
                "Яиц – ${neededIngredients[0]}, " +
                "молока – ${neededIngredients[1]}, " +
                "сливочного масла – ${neededIngredients[2]}"
    )
}