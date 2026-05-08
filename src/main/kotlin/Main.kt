package org.example

const val VALID_LOGIN = "admin"
const val VALID_PASSWORD = "1234"

fun authorize(login: String, password: String): String? {
    if (login == VALID_LOGIN && password == VALID_PASSWORD) {
        val chars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..32).map { chars.random() }.joinToString("")
    }
    return null
}

fun getCart(token: String?): List<String>? {
    if (token == null) return null
    return listOf("Ноутбук", "Мышь", "Клавиатура")
}

fun main() {
    val token = authorize(VALID_LOGIN, VALID_PASSWORD)
    val cart = getCart(token)
    if (cart != null) {
        println("Содержимое корзины: ${cart.joinToString(", ")}")
    } else {
        println("Неудачная авторизация")
    }
}