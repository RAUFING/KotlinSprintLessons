package org.example

enum class FishType(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {
    println("Вы можете добавить в аквариум следующих рыб:")
    for (fish in FishType.entries) {
        println("- ${fish.fishName}")
    }
}