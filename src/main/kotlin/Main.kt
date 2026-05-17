package org.example

class Ship(
    name: String,
    val averageSpeed: Double,
    val homePort: String,
) {
    var name: String = name
        get() = field
        set(value) {
            println("Имя корабля менять нельзя")
        }
}

fun main() {
    val ship = Ship("Летучий голландец", 25.0, "Роттердам")

    println("Имя: ${ship.name}")
    println("Скорость: ${ship.averageSpeed}")
    println("Порт приписки: ${ship.homePort}")

    println("\nПопытка сменить имя...")
    ship.name = "Титаник"

    println("\nПосле попытки:")
    println("Имя: ${ship.name}")
}