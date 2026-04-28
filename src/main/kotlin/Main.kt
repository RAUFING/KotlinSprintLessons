package org.example

fun main() {
    val input = "D2-D4;0"
    val list = input.split("-", ";")
    val from = list[0]
    val to = list[1]
    val stepNumber = list[2]
    println(from)
    println(to)
    println(stepNumber)
}