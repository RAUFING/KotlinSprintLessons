package org.example

const val KELVIN_TO_CELSIUS_OFFSET = 273

class WeatherInfo(daytimeKelvin: Int, nighttimeKelvin: Int, precipitation: Boolean) {
    val daytimeTemperature: Int = daytimeKelvin - KELVIN_TO_CELSIUS_OFFSET
    val nighttimeTemperature: Int = nighttimeKelvin - KELVIN_TO_CELSIUS_OFFSET
    val isPrecipitation: Boolean = precipitation
}

fun main() {
    val monthData = mutableListOf<WeatherInfo>()

    for (i in 1..30) {
        val daytimeK = (283..313).random()
        val nighttimeK = (273..303).random()
        val precipitation = listOf(true, false).random()
        monthData.add(WeatherInfo(daytimeK, nighttimeK, precipitation))
    }

    val daytimeTemps = monthData.map { it.daytimeTemperature }
    val nighttimeTemps = monthData.map { it.nighttimeTemperature }
    val daysWithPrecipitation = monthData.count { it.isPrecipitation }

    val avgDaytime = daytimeTemps.average()
    val avgNighttime = nighttimeTemps.average()

    println("Средняя дневная температура: ${"%.1f".format(avgDaytime)}°C")
    println("Средняя ночная температура: ${"%.1f".format(avgNighttime)}°C")
    println("Дней с осадками: $daysWithPrecipitation из 30")
}