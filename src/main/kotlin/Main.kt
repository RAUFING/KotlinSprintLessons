package org.example

class Order(
    val orderNumber: Int,
) {
    fun printOrders(item: String) {
        println("Заказан товар: $item")
    }

    fun printOrders(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)

    order1.printOrders("Ноутбук")
    order2.printOrders(listOf("Мышь", "Клавиатура", "Монитор"))
}