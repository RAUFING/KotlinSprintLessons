package org.example

class Spaceship {
    fun takeOff() {
        // TODO("Добавить логику взлёта")
    }

    fun land() {
        TODO("Метод приземления ещё не реализован")
    }

    fun shootAsteroid() {
        println("Корабль отстреливается от астероида")
    }
}

fun main() {
    val ship = Spaceship()
    ship.takeOff()
    ship.shootAsteroid()
}