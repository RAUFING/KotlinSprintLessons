package org.example

interface Swimmable {
    fun swimming()
}

interface Flyable {
    fun flying()
}

class CrucianCarp : Swimmable {
    override fun swimming() {
        println("Карась плавает в воде")
    }
}

class Gull : Flyable {
    override fun flying() {
        println("Чайка летит над волнами")
    }
}

class Duck : Swimmable, Flyable {
    override fun swimming() {
        println("Утка плавает в пруду")
    }

    override fun flying() {
        println("Утка летит на зимовку")
    }
}

fun main() {
    val carp = CrucianCarp()
    carp.swimming()

    val gull = Gull()
    gull.flying()

    val duck = Duck()
    duck.swimming()
    duck.flying()
}