package org.example

enum class Category {
    CLOTHING,
    STATIONERY,
    OTHER;

    fun getDisplayName(): String = when (this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        OTHER -> "Разное"
    }
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