package org.example

class WeatherReport(daytimeKelvin: Int, nighttimeKelvin: Int) {
    private val kelvinToCelsiusOffset = 273
    val daytimeTemperature: Int = daytimeKelvin - kelvinToCelsiusOffset
    val nighttimeTemperature: Int = nighttimeKelvin - kelvinToCelsiusOffset
    val isPrecipitation: Boolean = false

    fun printInfo() {
        println("Дневная температура: $daytimeTemperature")
        println("Ночная температура: $nighttimeTemperature")
        println("Осадки: ${if (isPrecipitation) "да" else "нет"}")
    }
}

fun main() {
    val report = WeatherReport(daytimeKelvin = 298, nighttimeKelvin = 288)
    report.printInfo()
}