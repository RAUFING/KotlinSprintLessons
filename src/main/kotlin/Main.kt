package org.example

fun main() {
    val items = listOf("Кнопка", "Меню", "Профиль", "Настройки", "Помощь")

    val clickActions: List<() -> Unit> = items.map { item ->
        { println("Нажат элемент $item") }
    }

    for (i in items.indices) {
        if ((i + 1) % 2 == 0) {
            clickActions[i]()
        }
    }
}