package org.example

abstract class Dice(val sides: Int) {
    fun roll() {
        println("Бросок d$sides: ${(1..sides).random()}")
    }
}

class Dice4 : Dice(4)
class Dice6 : Dice(6)
class Dice8 : Dice(8)

fun main() {
    val d4 = Dice4()
    val d6 = Dice6()
    val d8 = Dice8()

    val diceList: List<Dice> = listOf(d4, d6, d8)

    for (dice in diceList) {
        dice.roll()
    }
}