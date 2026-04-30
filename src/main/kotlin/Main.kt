package org.example

fun main() {
    val isDamaged = readln().toBoolean()
    val crewCount = readln().toInt()
    val provisionBoxes = readln().toInt()
    val isWeatherGood = readln().toBoolean()

    println(
        "Корабль может отправиться в плавание: " +
            "${(!isDamaged && crewCount in 55..70 && provisionBoxes > 50 && (isWeatherGood || !isWeatherGood)) || (isDamaged && crewCount == 70 && isWeatherGood && provisionBoxes >= 50)}",
    )
}
