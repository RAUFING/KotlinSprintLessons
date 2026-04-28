package org.example

fun main() {
    val firstName = "Татьяна"
    var lastName = "Андреева"
    val middleName = "Сергеевна"
    var age = 20
    println("[$firstName $lastName $middleName, $age]")

    age = 22
    lastName = "Сидорова"
    println("[$firstName $lastName $middleName, $age]")
}