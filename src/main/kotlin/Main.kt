package org.example

import kotlin.random.Random

const val KELVIN_TO_CELSIUS_OFFSET = 273

class WeatherInfo(
    daytimeKelvin: Int,
    nighttimeKelvin: Int,
    val isPrecipitation: Boolean,
) {
    val daytimeTemperature: Int = daytimeKelvin - KELVIN_TO_CELSIUS_OFFSET
    val nighttimeTemperature: Int = nighttimeKelvin - KELVIN_TO_CELSIUS_OFFSET
}

fun main() {
    val monthData = List(30) {
        WeatherInfo(
            daytimeKelvin = (283..313).random(),
            nighttimeKelvin = (273..303).random(),
            isPrecipitation = Random.nextBoolean(),
        )
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