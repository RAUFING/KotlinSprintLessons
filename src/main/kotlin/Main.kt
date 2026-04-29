package org.example

const val REQUIRED_HUMIDITY = 20
const val FORBIDDEN_SEASON = "зима"

fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val humidityPercent = 20
    val currentSeason = "зима"

    val isFavorable =
        isSunnyWeather &&
            isTentOpen &&
            humidityPercent == REQUIRED_HUMIDITY &&
            currentSeason != FORBIDDEN_SEASON

    println(
        "Благоприятные ли условия сейчас для роста бобовых? $isFavorable",
    )
}
