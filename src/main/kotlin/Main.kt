package org.example

data class User(
    val name: String,
    val age: Int,
    val email: String,
)

fun main() {
    val user = User("Анна", 25, "anna@example.com")

    val (name, age, email) = user

    println("Имя: $name")
    println("Возраст: $age")
    println("Email: $email")
}