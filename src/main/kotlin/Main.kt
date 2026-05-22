package org.example

fun List<Int>.evenNumbersSum(): Int {
    return filter { it % 2 == 0 }.sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.evenNumbersSum())
}