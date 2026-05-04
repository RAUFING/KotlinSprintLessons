package org.example

fun main() {
    val ingredients = arrayOf("мука", "сахар", "яйца", "молоко", "масло")
    println("Введите название ингредиента:")
    val query = readln()
    var found = false

    for (ingredient in ingredients) {
        if (ingredient.equals(query, ignoreCase = true)) {
            found = true
            break
        }
    }

    if (found) {
        println("Ингредиент $query в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
