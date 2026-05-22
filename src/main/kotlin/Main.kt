package org.example

fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y', 'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')
    return count { it.lowercaseChar() in vowels }
}

fun main() {
    println("hello".vowelCount())
    println("Kotlin".vowelCount())
    println("Привет".vowelCount())
}