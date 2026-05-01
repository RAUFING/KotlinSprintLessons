package org.example

import kotlin.random.Random

fun main() {
    val winningNumbers =
        listOf(
            Random.nextInt(0, 43),
            Random.nextInt(0, 43),
            Random.nextInt(0, 43),
        )

    println("Введите первое число (от 0 до 42):")
    val userInput1 = readln().toInt()
    println("Введите второе число (от 0 до 42):")
    val userInput2 = readln().toInt()
    println("Введите третье число (от 0 до 42):")
    val userInput3 = readln().toInt()

    val userNumbers = listOf(userInput1, userInput2, userInput3)
    val matchedNumbers = winningNumbers.intersect(userNumbers.toSet())
    val matchCount = matchedNumbers.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все три числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и выиграли крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: ${winningNumbers.joinToString()}")
}
