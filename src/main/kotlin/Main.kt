package org.example

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isHabitable: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
    val satellites: MutableList<Satellite> = mutableListOf(),
) : CelestialBody(name, hasAtmosphere, isHabitable)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
) : CelestialBody(name, hasAtmosphere, isHabitable)

fun main() {
    val earth = Planet(
        name = "Земля",
        hasAtmosphere = true,
        isHabitable = true,
    )

    val moon = Satellite(
        name = "Луна",
        hasAtmosphere = false,
        isHabitable = false,
    )

    val iss = Satellite(
        name = "МКС",
        hasAtmosphere = false,
        isHabitable = true,
    )

    earth.satellites.add(moon)
    earth.satellites.add(iss)

    println("Планета: ${earth.name}")
    println("Спутники:")
    for (satellite in earth.satellites) {
        println("- ${satellite.name}")
    }
}