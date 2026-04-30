package org.example

const val CREW_MIN = 55
const val CREW_MAX = 70
const val CREW_RECOMMENDED = 70
const val PROVISION_MIN_BASIC = 50
const val PROVISION_MIN_ALTERNATIVE = 50

fun main() {
    val isDamaged = readln().toBoolean()
    val crewCount = readln().toInt()
    val provisionBoxes = readln().toInt()
    val isWeatherGood = readln().toBoolean()

    println(
        "Корабль может отправиться в плавание: " +
            "${(!isDamaged && crewCount in CREW_MIN..CREW_MAX && provisionBoxes > PROVISION_MIN_BASIC) || (isDamaged && crewCount == CREW_RECOMMENDED && isWeatherGood && provisionBoxes >= PROVISION_MIN_ALTERNATIVE)}",
    )
}
