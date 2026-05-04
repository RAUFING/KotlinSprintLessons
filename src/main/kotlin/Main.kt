package org.example

fun main() {
    val ingredients = arrayOf("мука", "сахар", "яйца", "молоко", "масло")
    println("Введите название ингредиента:")
    val query = readln()

    for (ingredient in ingredients) {
        if (ingredient.equals(query, ignoreCase = true)) {
            println("Ингредиент $query в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}
