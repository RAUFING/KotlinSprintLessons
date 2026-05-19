package org.example

class Screen {
    fun drawPoint(x: Int, y: Int): String = "Нарисована точка с координатами ($x, $y)"
    fun drawPoint(x: Float, y: Float): String = "Нарисована точка с координатами ($x, $y)"
    fun drawCircle(x: Int, y: Int, radius: Int): String = "Нарисован круг с центром ($x, $y) и радиусом $radius"
    fun drawCircle(x: Float, y: Float, radius: Float): String = "Нарисован круг с центром ($x, $y) и радиусом $radius"
    fun drawSquare(x: Int, y: Int, width: Int, height: Int): String = "Нарисован квадрат с углом ($x, $y), шириной $width и высотой $height"
    fun drawSquare(x: Float, y: Float, width: Float, height: Float): String = "Нарисован квадрат с углом ($x, $y), шириной $width и высотой $height"
}

fun main() {
    val screen = Screen()
    println(screen.drawPoint(10, 20))
    println(screen.drawPoint(10.5f, 20.5f))
    println(screen.drawCircle(5, 5, 10))
    println(screen.drawCircle(5.5f, 5.5f, 10.5f))
    println(screen.drawSquare(0, 0, 30, 40))
    println(screen.drawSquare(0.0f, 0.0f, 30.5f, 40.5f))
}