package org.example

fun main() {
    val ingredients = listOf("мука", "яйца", "молоко")
    println("В рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ")}")
    ingredients.forEach { println(it) }
}