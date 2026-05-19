package org.example

class Screen {
    fun drawCircle(x: Int, y: Int): String = "Нарисован круг с центром ($x, $y)"
    fun drawCircle(x: Float, y: Float): String = "Нарисован круг с центром ($x, $y)"
    fun drawSquare(x: Int, y: Int): String = "Нарисован квадрат с углом ($x, $y)"
    fun drawSquare(x: Float, y: Float): String = "Нарисован квадрат с углом ($x, $y)"
    fun drawPoint(x: Int, y: Int): String = "Нарисована точка с координатами ($x, $y)"
    fun drawPoint(x: Float, y: Float): String = "Нарисована точка с координатами ($x, $y)"
}

fun main() {
    val screen = Screen()
    println(screen.drawPoint(10, 20))
    println(screen.drawPoint(10.5f, 20.5f))
    println(screen.drawCircle(5, 5))
    println(screen.drawCircle(5.5f, 5.5f))
    println(screen.drawSquare(0, 0))
    println(screen.drawSquare(0.0f, 0.0f))
}