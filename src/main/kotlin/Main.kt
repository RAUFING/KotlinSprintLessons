package org.example

class WeatherInfo(daytimeKelvin: Int, nighttimeKelvin: Int, precipitation: Boolean) {
    private val kelvinOffset = 273
    val daytimeTemperature: Int = daytimeKelvin - kelvinOffset
    val nighttimeTemperature: Int = nighttimeKelvin - kelvinOffset
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