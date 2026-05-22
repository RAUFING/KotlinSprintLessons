package org.example

fun Map<String, Int>.maxCategory(): String? {
    return maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Сила" to 10,
        "Ловкость" to 25,
        "Интеллект" to 15,
        "Выносливость" to 25,
    )
    println(skills.maxCategory())
}