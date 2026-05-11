package org.example

const val KELVIN_TO_CELSIUS_OFFSET = 273

class WeatherReport(daytimeKelvin: Int, nighttimeKelvin: Int) {
    val daytimeTemperature: Int = daytimeKelvin - KELVIN_TO_CELSIUS_OFFSET
    val nighttimeTemperature: Int = nighttimeKelvin - KELVIN_TO_CELSIUS_OFFSET
    val isPrecipitation: Boolean = false

    init {
        println("Дневная температура: $daytimeTemperature")
        println("Ночная температура: $nighttimeTemperature")
        println("Осадки: ${if (isPrecipitation) "да" else "нет"}")
    }
}

fun main() {
    val report = WeatherReport(daytimeKelvin = 298, nighttimeKelvin = 288)
}