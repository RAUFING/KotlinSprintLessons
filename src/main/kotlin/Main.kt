package org.example

class PhoneRecord(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = mutableListOf<PhoneRecord>()

    for (i in 1..5) {
        println("Введите имя:")
        val name = readln()

        println("Введите номер телефона:")
        val phoneNumber = readln().toLongOrNull()

        if (phoneNumber == null) {
            println("Номер телефона не указан, запись не добавлена.")
            continue
        }

        println("Введите компанию (можно пропустить):")
        val company = readln().ifEmpty { null }

        phoneBook.add(PhoneRecord(name, phoneNumber, company))
    }

    for (record in phoneBook) {
        record.printInfo()
        println("---")
    }
}