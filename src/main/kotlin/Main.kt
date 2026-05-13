package org.example

class PhoneEntry(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    println("Введите номер телефона:")
    val phoneString = readln()

    val phoneNumber: Long? = try {
        phoneString.toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e.javaClass.simpleName}")
        null
    }

    if (phoneNumber != null) {
        val entry = PhoneEntry("Ростислав", phoneNumber, "Reddit")
        entry.printInfo()
    }
}