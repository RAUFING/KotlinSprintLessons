package org.example

class Category(
    val id: Int,
    val title: String,
    val description: String,
    val iconUrl: String,
)

class Ingredient(
    val name: String,
    val quantity: String,
)

class Recipe(
    val id: Int,
    val title: String,
    val categoryId: Int,
    val ingredients: List<Ingredient>,
    val instructions: String,
    val imageUrl: String,
)