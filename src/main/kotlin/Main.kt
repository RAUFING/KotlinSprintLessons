package org.example

fun main() {
    val symbols = 'a'..'z'
    val numbers = '0'..'9'
    var pin = ""

    for (i in 1..6) {
        if (i % 2 == 0) {
            pin += numbers.random()
            continue
        }
        pin += symbols.random()
    }

    println(pin)
}
