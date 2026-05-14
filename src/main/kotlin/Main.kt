package org.example

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Carp : Swimmable {
    override fun swim() = println("Карась плавает")
}

class Seagull : Flyable {
    override fun fly() = println("Чайка летает")
}

class Duck : Flyable, Swimmable {
    override fun fly() = println("Утка летает")
    override fun swim() = println("Утка плавает")
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    carp.swim()
    seagull.fly()
    duck.fly()
    duck.swim()
}