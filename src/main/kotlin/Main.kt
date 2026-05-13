package org.example

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double = Math.PI * radius * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
}

fun main() {
    val figures = listOf(
        Circle("черный", 5.0),
        Circle("белый", 3.0),
        Rectangle("черный", 4.0, 6.0),
        Rectangle("белый", 2.0, 8.0),
    )

    val blackPerimeterSum = figures.filter { it.color == "черный" }.sumOf { it.perimeter() }
    val whiteAreaSum = figures.filter { it.color == "белый" }.sumOf { it.area() }

    println("Сумма периметров черных фигур: ${"%.2f".format(blackPerimeterSum)}")
    println("Сумма площадей белых фигур: ${"%.2f".format(whiteAreaSum)}")
}