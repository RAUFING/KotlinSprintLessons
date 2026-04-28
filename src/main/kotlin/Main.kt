package org.example

fun main() {
    var firstName = "Татьяна"
    var lastName = "Андреевна"
    var middleName = "Сергеевна"
    var age = 20
    println("[$firstName $lastName $middleName, $age]")

    age = 22
    lastName = "Сидорова"
    println("[$firstName $lastName $middleName, $age]")
}