package org.example

abstract class User(
    val name: String,
) {
    abstract fun read()
    abstract fun write()
}

class RegularUser(name: String) : User(name) {
    override fun read() {
        println("$name читает форум")
    }

    override fun write() {
        println("$name пишет сообщение")
    }
}

class Admin(name: String) : User(name) {
    override fun read() {
        println("$name читает форум")
    }

    override fun write() {
        println("$name пишет сообщение")
    }

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