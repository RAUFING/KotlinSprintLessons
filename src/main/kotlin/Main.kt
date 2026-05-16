package org.example

class Dice {
    private val number = (1..6).random()
    fun printNumber() = println(number)
}