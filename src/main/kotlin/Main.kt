package org.example

fun main() {
    val items = listOf("Кнопка", "Меню", "Профиль", "Настройки", "Помощь")

    val clickActions: List<() -> Unit> = items.map { item ->
        { println("Нажат элемент $item") }
    }

    clickActions.forEachIndexed { index, action ->
        if ((index + 1) % 2 == 0) action()
    }
}