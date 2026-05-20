package org.example

enum class Category(private val displayName: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHER("Разное");

    fun getDisplayName(): String = displayName
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun printInfo() {
        println("Товар: $name, ID: $id, Категория: ${category.getDisplayName()}")
    }
}

fun main() {
    val products = listOf(
        Product("Футболка", 1, Category.CLOTHING),
        Product("Ручка", 2, Category.STATIONERY),
        Product("Кружка", 3, Category.OTHER),
    )

    for (product in products) {
        product.printInfo()
    }
}