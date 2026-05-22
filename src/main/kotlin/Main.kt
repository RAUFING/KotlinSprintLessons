package org.example

import java.io.File

fun File.prependWord(word: String) {
    val lowercaseWord = word.lowercase()
    val existingContent = if (exists()) readText() else ""
    writeText("$lowercaseWord\n$existingContent")
}

fun main() {
    val file = File("dictionary.txt")
    file.prependWord("Кот")
    file.prependWord("Собака")
}