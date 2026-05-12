package org.example

class PhoneBookContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact = PhoneBookContact(
        name = "Ростислав",
        phoneNumber = 89123456789,
    )
    contact.printInfo()
}