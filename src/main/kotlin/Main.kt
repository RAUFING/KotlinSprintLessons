package org.example

interface Movable {
    fun move()
}

interface PassengerTransportable {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Загружено $count пассажиров. Текущее количество: $currentPassengers/$maxPassengers")
        } else {
            println("Нет мест для $count пассажиров")
        }
    }

    fun unloadPassengers(count: Int) {
        if (currentPassengers >= count) {
            currentPassengers -= count
            println("Выгружено $count пассажиров. Текущее количество: $currentPassengers/$maxPassengers")
        } else {
            println("Недостаточно пассажиров для выгрузки")
        }
    }
}

interface CargoTransportable {
    val maxCargo: Double
    var currentCargo: Double

    fun loadCargo(amount: Double) {
        if (currentCargo + amount <= maxCargo) {
            currentCargo += amount
            println("Груз загружен. Текущий вес: $currentCargo/$maxCargo тонн")
        } else {
            println("Недостаточно места для груза")
        }
    }

    fun unloadCargo(amount: Double) {
        if (currentCargo >= amount) {
            currentCargo -= amount
            println("Груз выгружен. Текущий вес: $currentCargo/$maxCargo тонн")
        } else {
            println("Недостаточно груза для выгрузки")
        }
    }
}

class Truck : Movable, PassengerTransportable, CargoTransportable {
    override val maxPassengers = 1
    override var currentPassengers = 0
    override val maxCargo = 2.0
    override var currentCargo = 0.0

    override fun move() {
        println("Грузовик движется")
    }
}

class Car : Movable, PassengerTransportable {
    override val maxPassengers = 3
    override var currentPassengers = 0

    override fun move() {
        println("Легковой автомобиль движется")
    }
}

fun main() {
    val truck = Truck()
    val car1 = Car()
    val car2 = Car()

    truck.loadCargo(2.0)
    truck.loadPassengers(1)

    car1.loadPassengers(3)
    car2.loadPassengers(2)

    println("\nИтог:")
    println("Грузовик: пассажиры ${truck.currentPassengers}/${truck.maxPassengers}, груз ${truck.currentCargo}/${truck.maxCargo} тонн")
    println("Легковая 1: пассажиры ${car1.currentPassengers}/${car1.maxPassengers}")
    println("Легковая 2: пассажиры ${car2.currentPassengers}/${car2.maxPassengers}")
}