package org.example

open class Liner {
    open val speed: Int = 30
    open val capacity: Int = 3000
    open val description: String = "Лайнер"

    fun printInfo() {
        println("Тип: $description, Скорость: $speed, Вместимость: $capacity")
    }
}

class CargoShip : Liner() {
    override val speed: Int = 20
    override val capacity: Int = 500
    override val description: String = "Грузовой"
}

class Icebreaker : Liner() {
    override val speed: Int = 15
    override val capacity: Int = 200
    override val description: String = "Ледокол"

    fun breakIce() {
        println("Ледокол колет лёд")
    }
}

fun main() {
    val liner = Liner()
    val cargo = CargoShip()
    val icebreaker = Icebreaker()

    liner.printInfo()
    cargo.printInfo()
    icebreaker.printInfo()
    icebreaker.breakIce()
}