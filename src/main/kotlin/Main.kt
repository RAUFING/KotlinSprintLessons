package org.example

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val regular1 = RegularBook("Война и мир", "Толстой")
    val regular2 = RegularBook("Война и мир", "Толстой")

    val data1 = DataBook("Война и мир", "Толстой")
    val data2 = DataBook("Война и мир", "Толстой")

    // Обычный класс сравнивает ссылки на объекты (адреса в памяти), а не содержимое.
    // Поэтому два разных объекта с одинаковыми данными НЕ равны.
    println("RegularBook: ${regular1 == regular2}")

    // Data class автоматически переопределяет equals() и сравнивает содержимое объектов.
    // Поэтому два объекта с одинаковыми данными равны.
    println("DataBook: ${data1 == data2}")
}