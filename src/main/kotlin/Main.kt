package org.example

class WeatherData(
    val daytimeTemperature: Int,
    val nighttimeTemperature: Int,
    val isPrecipitation: Boolean,
) {
    fun printInfo() {
        println("Дневная температура: $daytimeTemperature")
        println("Ночная температура: $nighttimeTemperature")
        println("Осадки: ${if (isPrecipitation) "да" else "нет"}")
    }
}

fun main() {
    val day = WeatherData(
        daytimeTemperature = 25,
        nighttimeTemperature = 15,
        isPrecipitation = false,
    )
    day.printInfo()
}