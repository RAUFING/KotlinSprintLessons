package org.example

abstract class Box {
    abstract fun surfaceArea(): Double
}

class RectangularBox(
    val length: Double,
    val width: Double,
    val height: Double,
) : Box() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + width * height + height * length)
    }
}

class Cube(
    val edge: Double,
) : Box() {
    override fun surfaceArea(): Double {
        return 6 * edge * edge
    }
}

fun main() {
    val rectangular = RectangularBox(2.0, 3.0, 4.0)
    val cube = Cube(5.0)

    println("Площадь прямоугольной коробки: ${rectangular.surfaceArea()}")
    println("Площадь кубической коробки: ${cube.surfaceArea()}")
}