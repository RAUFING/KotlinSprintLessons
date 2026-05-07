package org.example

fun rollDice(): Int {
    return (1..6).random()
}

fun main() {
    println("Ход игрока...")
    val playerRoll = rollDice()
    println("Игрок выбросил: $playerRoll")

    println("Ход компьютера...")
    val computerRoll = rollDice()
    println("Компьютер выбросил: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Победило человечество")
        computerRoll > playerRoll -> println("Победила машина")
        else -> println("Победила дружба")
    }
}