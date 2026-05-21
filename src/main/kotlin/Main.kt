package org.example

class Player(
    val name: String,
    val hasKey: Boolean,
)

fun main() {
    val tryOpenDoor: (Player) -> String = { player ->
        if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"
    }

    val playerWithKey = Player("Герой", true)
    val playerWithoutKey = Player("Путник", false)

    println(tryOpenDoor(playerWithKey))
    println(tryOpenDoor(playerWithoutKey))
}