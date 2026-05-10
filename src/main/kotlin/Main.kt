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
    val unit: String,
)

class Recipe(
    val id: Int,
    val title: String,
    val categoryId: Int,
    val ingredients: List<Ingredient>,
    val steps: List<String>,
    val imageUrl: String,
)