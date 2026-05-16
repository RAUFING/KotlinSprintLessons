package org.example

class Dice {
    private val number = (1..6).random()
    fun printNumber() = println("На кубике выпало $number")
}

fun main() {
    val dice = Dice()
    dice.printNumber()
}