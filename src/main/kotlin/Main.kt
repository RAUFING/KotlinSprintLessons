package org.example

fun main() {
    val username = "Анна"
    val greet: () -> String = { "С наступающим Новым Годом, $username!" }
    println(greet())
}