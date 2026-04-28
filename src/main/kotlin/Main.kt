package org.example

fun main() {
    val from = "E2"
    var to = "E4"
    var moveNumber = 1
    println("[$from-$to;$moveNumber]")

    moveNumber++
    to = "D3"
    println("[$from-$to;$moveNumber]")
}