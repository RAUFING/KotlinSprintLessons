package org.example

class Order(
    val orderNumber: Int,
) {
    fun printOrder(item: String) {
        println("Заказан товар: $item")
    }

    fun printOrder(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)

    order1.printOrder("Ноутбук")
    order2.printOrder(listOf("Мышь", "Клавиатура", "Монитор"))
}