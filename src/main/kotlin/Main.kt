package org.example

fun main() {
    println("Введите 5 ингредиентов через запятую с пробелом:")
    val input = readln()
    val ingredients = input.split(", ").toMutableList()
    val sortedIngredients = ingredients.sorted()
    println("Отсортированный список: ${sortedIngredients.joinToString(", ")}")
}