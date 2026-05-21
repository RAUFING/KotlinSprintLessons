package org.example

class Player(
    val name: String,
    val maxHealth: Int,
    var currentHealth: Int,
)

fun main() {
    val healPotion: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("${player.name} выпил лечебное зелье! Здоровье восстановлено до ${player.currentHealth}/${player.maxHealth}")
    }

    val player = Player("Герой", 100, 30)
    println("До лечения: ${player.currentHealth}/${player.maxHealth}")
    healPotion(player)
}