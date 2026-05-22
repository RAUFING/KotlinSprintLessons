package org.example

class Robot {
    private val phrases = listOf(
        "Привет человек",
        "Я робот",
        "Сегодня хорошая погода",
        "Мне нужна зарядка",
        "Давай работать",
    )

    private var modifier: (String) -> String = { it }

    fun say() {
        val phrase = phrases.random()
        println(modifier(phrase))
    }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }
}

fun main() {
    val robot = Robot()

    println("Обычная речь:")
    robot.say()

    println("\nУстанавливаем инвертирующий модификатор...")
    robot.setModifier { phrase -> phrase.reversed() }

    println("Речь с модификатором:")
    robot.say()
}