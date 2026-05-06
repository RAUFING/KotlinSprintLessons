package org.example

fun main() {
    val baseIngredients = mutableListOf("мука", "яйца", "молоко")
    println("В рецепте есть базовые ингредиенты: [${baseIngredients.joinToString(", ")}]")

    println("Желаете добавить еще?")
    val answer = readln()

    if (!answer.equals("да", ignoreCase = true)) {
        return
    }

    println("Какой ингредиент вы хотите добавить?")
    val newIngredient = readln()
    baseIngredients.add(newIngredient)

    println("Теперь в рецепте есть следующие ингредиенты: [${baseIngredients.joinToString(", ")}]")
}