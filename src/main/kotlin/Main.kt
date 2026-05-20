package org.example

class Spaceship {
    fun takeOff() {
        println("Корабль взлетает")
    }

    fun land() {
        println("Корабль приземляется")
    }

    fun shootAsteroid() {
        TODO("Нужна дополнительная логика для стрельбы по астероидам")
    }

    fun hyperjump() {
        throw NotImplementedError("Метод гиперпрыжка ещё не реализован")
    }
}

fun main() {
    val ship = Spaceship()
    ship.takeOff()
    ship.land()
    ship.shootAsteroid()
}