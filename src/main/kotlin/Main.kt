package org.example

class Parcel(
    val trackingNumber: String,
    initialLocation: String,
) {
    var location: String = initialLocation
        set(value) {
            field = value
            moveCount++
        }

    var moveCount: Int = 0
        private set
}

fun main() {
    val parcel = Parcel("TK12345", "Склад отправителя")

    println("Номер посылки: ${parcel.trackingNumber}")
    println("Местоположение: ${parcel.location}")
    println("Перемещений: ${parcel.moveCount}")

    println("\nПосылка прибыла в промежуточный пункт...")
    parcel.location = "Сортировочный центр Казань"

    println("Местоположение: ${parcel.location}")
    println("Перемещений: ${parcel.moveCount}")

    println("\nПосылка прибыла в пункт выдачи...")
    parcel.location = "Пункт выдачи №5"

    println("Местоположение: ${parcel.location}")
    println("Перемещений: ${parcel.moveCount}")
}