package org.example

open class Liner(
    open val passengerCapacity: Int = 3000,
    open val cargoCapacity: Int = 100,
    open val speed: Int = 30,
    open val description: String = "Лайнер",
) {
    open fun load() {
        println("Выдвигает горизонтальный трап со шкафута")
    }

    fun printInfo() {
        print("Тип: $description, Скорость: $speed, Пассажиры: $passengerCapacity, Груз: $cargoCapacity, Погрузка: ")
        load()
    }
}

class CargoShip : Liner(
    passengerCapacity = 100,
    cargoCapacity = 5000,
    speed = 20,
    description = "Грузовой",
) {
    override fun load() {
        println("Активирует погрузочный кран")
    }
}

class Icebreaker : Liner(
    passengerCapacity = 50,
    cargoCapacity = 500,
    speed = 15,
    description = "Ледокол",
) {
    override fun load() {
        println("Открывает ворота со стороны кормы")
    }

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