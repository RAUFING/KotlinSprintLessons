package org.example

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun Player.isHealthy(): Boolean = currentHealth == maxHealth

fun main() {
    val player = Player("Герой", 100, 100)
    println(player.isHealthy())  // true

    player.currentHealth = 50
    println(player.isHealthy())  // false
}