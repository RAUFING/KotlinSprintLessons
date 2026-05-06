package org.example

fun main() {
    println("Введите количество ингредиентов:")
    val size = readln().toInt()
    val ingredients = arrayOfNulls<String>(size)

    for (i in 0 until size) {
        println("Введите ингредиент ${i + 1}:")
        ingredients[i] = readln()
    }

    println("Список ингредиентов: ${ingredients.joinToString(", ")}")
}