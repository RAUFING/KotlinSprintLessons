package org.example

abstract class Product(
    val name: String,
    var stockQuantity: Int,
)

interface Searchable {
    fun search()
}

class Instrument(
    name: String,
    stockQuantity: Int,
) : Product(name, stockQuantity), Searchable {
    override fun search() {
        println("Выполняется поиск комплектующих для инструмента \"$name\"")
    }
}

class Accessory(
    name: String,
    stockQuantity: Int,
) : Product(name, stockQuantity)

fun main() {
    val guitar = Instrument("Гитара", 5)
    val strings = Accessory("Струны", 20)

    guitar.search()
}