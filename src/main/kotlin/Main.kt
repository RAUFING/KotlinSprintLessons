package org.example

class RegularBookV2(
    val title: String,
    val author: String,
)

data class DataBookV2(
    val title: String,
    val author: String,
)

fun main() {
    val regular = RegularBookV2("Война и мир", "Толстой")
    val data = DataBookV2("Война и мир", "Толстой")

    // Обычный класс по умолчанию использует toString() из Any,
    // который выводит имя класса и хеш-код объекта (адрес в памяти).
    println(regular)

    // Data class автоматически переопределяет toString()
    // и выводит значения всех свойств в читаемом формате.
    println(data)
}