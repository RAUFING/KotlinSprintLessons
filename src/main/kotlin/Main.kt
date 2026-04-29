package org.example

fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val humidityPercent = 20
    val currentSeason = "зима"

    val isFavorable = isSunnyWeather && isTentOpen && humidityPercent == 20 && currentSeason != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")
}
