package org.example

fun main() {
    val ingredients = mutableSetOf<String>()

    repeat(5) {
        println("Введите ингредиент ${it + 1}:")
        ingredients.add(readln())
    }

    val result = ingredients.sorted()
        .joinToString(", ")
        .replaceFirstChar { it.uppercase() }

    println(result)
}