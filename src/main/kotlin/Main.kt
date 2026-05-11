package org.example

class WeatherReport(daytimeKelvin: Int, nighttimeKelvin: Int) {
    val daytimeTemperature: Int = daytimeKelvin - 273
    val nighttimeTemperature: Int = nighttimeKelvin - 273
    var isPrecipitation: Boolean = false

    fun printInfo() {
        println("Дневная температура: $daytimeTemperature")
        println("Ночная температура: $nighttimeTemperature")
        println("Осадки: ${if (isPrecipitation) "да" else "нет"}")
    }
}

fun main() {
    val report = WeatherReport(daytimeKelvin = 298, nighttimeKelvin = 288)
    report.isPrecipitation = true
    report.printInfo()
}