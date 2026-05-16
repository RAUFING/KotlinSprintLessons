package org.example

import kotlin.math.pow

private const val PI = 3.14

class Circle(private val radius: Double) {
    fun getCircumference(): Double = 2 * PI * radius
    fun getArea(): Double = PI * radius.pow(2)
}

fun main() {
    val circle = Circle(5.0)
    println("Длина окружности: ${circle.getCircumference()}")
    println("Площадь круга: ${circle.getArea()}")
}