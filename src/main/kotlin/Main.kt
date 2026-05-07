package org.example

fun main() {
    println("Введите 5 ингредиентов через запятую с пробелом:")
    val input = readln()
    val ingredients = input.split(", ").sorted()
    println("Отсортированный список: ${ingredients.joinToString(", ")}")
}