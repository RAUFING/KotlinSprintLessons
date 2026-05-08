package org.example

fun rollDice(): Int {
    return (1..6).random()
}

fun playRound(): String {
    println("Ход игрока...")
    val playerRoll = rollDice()
    println("Игрок выбросил: $playerRoll")

    println("Ход компьютера...")
    val computerRoll = rollDice()
    println("Компьютер выбросил: $computerRoll")

    return when {
        playerRoll > computerRoll -> "player"
        computerRoll > playerRoll -> "computer"
        else -> "draw"
    }
}

fun main() {
    var playerWins = 0
    var playAgain = true

    while (playAgain) {
        val result = playRound()

        when (result) {
            "player" -> {
                println("Победило человечество")
                playerWins++
            }
            "computer" -> println("Победила машина")
            else -> println("Победила дружба")
        }

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val answer = readln()
        playAgain = answer.equals("Да", ignoreCase = true)
    }

    println("Количество выигранных партий: $playerWins")
}