package org.example

class WeatherForecast {
    var daytimeTemperature: Int = 0
    var nighttimeTemperature: Int = 0
    var isPrecipitation: Boolean = false

    fun printInfo() {
        println("Дневная температура: $daytimeTemperature")
        println("Ночная температура: $nighttimeTemperature")
        println("Осадки: ${if (isPrecipitation) "да" else "нет"}")
    }
}

fun main() {
    val day1 = WeatherForecast()
    day1.daytimeTemperature = 25
    day1.nighttimeTemperature = 15
    day1.isPrecipitation = false
    day1.printInfo()

    val day2 = WeatherForecast()
    day2.daytimeTemperature = 10
    day2.nighttimeTemperature = 3
    day2.isPrecipitation = true
    day2.printInfo()
}