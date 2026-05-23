package org.example

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая к Солнцу звёздная система",
        dateTime = LocalDateTime.of(2026, 5, 23, 12, 0),
        distanceFromEarth = 4.37,
    )

    println("Название: ${alphaCentauri.component1()}")
    println("Описание: ${alphaCentauri.component2()}")
    println("Дата и время: ${alphaCentauri.component3()}")
    println("Расстояние от Земли: ${alphaCentauri.component4()} св. лет")
}