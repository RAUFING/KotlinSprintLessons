package org.example

enum class FishType {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("Вы можете добавить в аквариум следующих рыб:")
    for (fish in FishType.entries) {
        println("- ${fish.name}")
    }
}