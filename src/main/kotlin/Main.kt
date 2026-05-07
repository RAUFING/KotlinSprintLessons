package org.example

fun main() {
    val ingredients = sortedSetOf<String>()

    repeat(5) {
        println("Введите ингредиент ${it + 1}:")
        ingredients.add(readln().trim())
    }

    val result = ingredients.joinToString(", ")
        .replaceFirstChar { it.uppercase() }
    println(result)
}