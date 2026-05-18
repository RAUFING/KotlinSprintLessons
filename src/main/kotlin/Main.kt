package org.example

abstract class Animal(val name: String) {
    open fun eat() {
        println("$name -> ест")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val animals: List<Animal> = listOf(
        Fox("Алиса"),
        Dog("Бобик"),
        Cat("Мурка"),
    )

    for (animal in animals) {
        animal.eat()
    }
}