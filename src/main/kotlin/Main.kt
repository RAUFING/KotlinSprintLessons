package org.example

const val PASSWORD_SIZE = 6

fun main() {
    val symbols = 'a'..'z'
    val numbers = '0'..'9'
    var pin = ""

    for (i in 1..PASSWORD_SIZE) {
        pin +=
            if (i % 2 == 0) {
                numbers.random()
            } else {
                symbols.random()
            }
    }

    println(pin)
}
