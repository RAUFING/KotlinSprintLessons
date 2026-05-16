package org.example

class Player(
    val name: String,
    private var health: Int,
    private var attackPower: Int
) {
    fun takeDamage(damage: Int) {
        if (health <= 0) return
        health -= damage
        if (health <= 0) {
            die()
        }
    }

    fun heal(amount: Int) {
        if (health <= 0) return
        health += amount
    }

    private fun die() {
        health = 0
        attackPower = 0
    }

    fun printStatus() {
        println("Игрок $name: здоровье = $health, сила удара = $attackPower")
    }
}

fun main() {
    val player = Player("Герой", 100, 25)
    player.printStatus()

    player.takeDamage(30)
    player.printStatus()

    player.heal(10)
    player.printStatus()

    player.takeDamage(50)
    player.printStatus()

    player.takeDamage(40)  // добиваем
    player.printStatus()

    player.heal(100)  // уже не поможет
    player.printStatus()
}