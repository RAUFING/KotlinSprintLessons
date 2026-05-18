package org.example

class Order(
    val orderNumber: Int,
) {
    fun printItems(item: String) {
        println("Заказан товар: $item")
    }

    fun printItems(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)

    order1.printItems("Ноутбук")
    order2.printItems(listOf("Мышь", "Клавиатура", "Монитор"))
}