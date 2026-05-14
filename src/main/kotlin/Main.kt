package org.example

abstract class User(
    val name: String,
) {
    fun read() {
        println("$name читает форум")
    }

    fun write() {
        println("$name пишет сообщение")
    }
}

class RegularUser(name: String) : User(name)

class Admin(name: String) : User(name) {
    fun deleteMessage() {
        println("$name удаляет сообщение")
    }

    fun deleteUser() {
        println("$name удаляет пользователя")
    }
}

fun main() {
    val user = RegularUser("Анна")
    val admin = Admin("Борис")

    user.read()
    user.write()

    admin.read()
    admin.write()
    admin.deleteMessage()
    admin.deleteUser()
}