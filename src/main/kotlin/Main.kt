package org.example

fun main() {
    val ingredients = arrayOf("мука", "сахар", "яйца", "молоко", "масло")
    println("Введите название ингредиента:")
    val query = readln()
    if (query in ingredients) {
        println("Ингредиент $query в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}
