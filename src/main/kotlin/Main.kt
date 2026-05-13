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
    val satellites: List<Satellite>,
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
        satellites = listOf(
            Satellite("Луна", false, false),
            Satellite("МКС", false, true),
        ),
    )

    println("Планета: ${earth.name}")
    println("Спутники:")
    for (satellite in earth.satellites) {
        println("- ${satellite.name}")
    }
}