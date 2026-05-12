package org.example

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun getCompanyOrNull(): String? = company
}

fun main() {
    val contacts = listOf(
        Contact("Анна", 89000000001, "Яндекс"),
        Contact("Борис", 89000000002, null),
        Contact("Виктор", 89000000003, "null"),
        Contact("Галина", 89000000004, null),
        Contact("Дмитрий", 89000000005, "Сбер"),
    )

    val companies = contacts.mapNotNull { it.company }

    println("Существующие компании: ${companies.joinToString(", ")}")
}