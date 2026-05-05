package org.example

fun main() {
    val ingredients = arrayOf("мука", "сахар", "яйца", "молоко", "масло")
    println(ingredients.joinToString(", "))
    println("Какой ингредиент вы хотите заменить?")
    val queryIngredient = readln()
    val index = ingredients.indexOf(queryIngredient)
    if (index != -1) {
        println("Введите новый ингредиент:")
        val newIngredient = readln()
        ingredients[index] = newIngredient
    } else {
        println("Такого ингредиента нет в списке")
    }
    println("Готово! Вы сохранили следующий список: [${ingredients.joinToString(", ")}]")
}