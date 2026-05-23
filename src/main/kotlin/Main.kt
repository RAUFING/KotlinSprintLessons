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

    val (name, description, dateTime, distanceFromEarth) = alphaCentauri

    println("Название: $name")
    println("Описание: $description")
    println("Дата и время: $dateTime")
    println("Расстояние от Земли: $distanceFromEarth св. лет")
}