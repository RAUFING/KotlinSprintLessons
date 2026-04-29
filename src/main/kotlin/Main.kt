package org.example

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100

fun main() {
    val cargo1Weight = 20
    val cargo1Volume = 80
    val cargo2Weight = 50
    val cargo2Volume = 100

    println(
        "Груз с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории 'Average': ${cargo1Weight > AVERAGE_MIN_WEIGHT && cargo1Weight <= AVERAGE_MAX_WEIGHT && cargo1Volume < AVERAGE_MAX_VOLUME}",
    )
    println(
        "Груз с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории 'Average': ${cargo2Weight > AVERAGE_MIN_WEIGHT && cargo2Weight <= AVERAGE_MAX_WEIGHT && cargo2Volume < AVERAGE_MAX_VOLUME}",
    )
}
