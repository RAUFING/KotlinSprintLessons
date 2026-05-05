package org.example

fun main() {
    val ingredients = arrayOf("мука", "сахар", "яйца", "молоко", "масло")
    println(ingredients.joinToString(", "))
    println("Какой ингридиент вы хотите удалить?")
    val queryIngredient = readln()
    if (queryIngredient in ingredients) {
        val queryReplaceIngredient = readln()
        ingredients[ingredients.indexOf(queryIngredient)] = queryReplaceIngredient
    } else {
        println("Такого ингредиента нет в списке")
    }
    println("Готов! Вы сохранили следущий список: [${ingredients.joinToString(", ")}]")
}
