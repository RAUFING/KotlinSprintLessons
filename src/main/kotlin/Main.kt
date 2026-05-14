package org.example

interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}

class CrucianCarp : Swimmable {
    override fun swim() {
        println("Карась плавает в воде")
    }
}

class Gull : Flyable {
    override fun fly() {
        println("Чайка летит над волнами")
    }
}

class Duck : Swimmable, Flyable {
    override fun swim() {
        println("Утка плавает в пруду")
    }

    override fun fly() {
        println("Утка летит на зимовку")
    }
}

fun main() {
    val carp = CrucianCarp()
    carp.swim()

    val gull = Gull()
    gull.fly()

    val duck = Duck()
    duck.swim()
    duck.fly()
}