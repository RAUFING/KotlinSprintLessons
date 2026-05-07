package org.example

fun main() {
    println("Введите количество ингредиентов:")
    val size = readln().toInt()
    val ingredients = Array(size) { "" }

    for (i in ingredients.indices) {
        println("Введите ингредиент ${i + 1}:")
        ingredients[i] = readln()
    }

    println("Список ингредиентов: ${ingredients.joinToString(", ")}")
}