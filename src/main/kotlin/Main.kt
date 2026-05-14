package org.example

abstract class WeatherStationStats

class Temperature(val value: Double) : WeatherStationStats()
class PrecipitationAmount(val value: Double) : WeatherStationStats()

class WeatherServer {
    fun sendReport(stats: WeatherStationStats) {
        when (stats) {
            is Temperature -> println("Температура: ${stats.value}°C")
            is PrecipitationAmount -> println("Осадки: ${stats.value} мм")
        }
    }
}

fun main() {
    val temperature = Temperature(23.5)
    val precipitation = PrecipitationAmount(5.2)

    val server = WeatherServer()
    server.sendReport(temperature)
    server.sendReport(precipitation)
}