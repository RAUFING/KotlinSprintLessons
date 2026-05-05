package org.example

fun main() {
    val ingredients = arrayOf("мука", "сахар", "яйца", "молоко", "масло")
    println(ingredients.joinToString(", "))
    println("Какой ингридиент вы хотите удалить?")
    val query = readln()

}
