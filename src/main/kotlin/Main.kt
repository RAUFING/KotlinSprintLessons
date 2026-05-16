package org.example

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun circumference(): Double = 2 * pi * radius
    fun area(): Double = pi * radius * radius
}

fun main() {
    val circle = Circle(radius = 5.0)
    println("Длина окружности: ${circle.circumference()}")
    println("Площадь круга: ${circle.area()}")
}