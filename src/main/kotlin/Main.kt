package org.example

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text)

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(author: String, text: String) {
        messages.add(Message(id = nextId++, author = author, text = text))
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {
        messages.add(
            ChildMessage(
                id = nextId++,
                author = author,
                text = text,
                parentMessageId = parentMessageId,
            )
        )
    }

    fun printChat() {
        val grouped = messages.groupBy { msg ->
            if (msg is ChildMessage) msg.parentMessageId else msg.id
        }

        for (msg in messages) {
            if (msg !is ChildMessage) {
                println("${msg.author}: ${msg.text}")
                grouped[msg.id]?.filterIsInstance<ChildMessage>()?.forEach { child ->
                    println("\t${child.author}: ${child.text}")
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Alice", "Привет всем!")
    chat.addThreadMessage("Bob", "Привет, Alice!", parentMessageId = 1)
    chat.addThreadMessage("Charlie", "Здарова!", parentMessageId = 1)
    chat.addMessage("Bob", "Как дела?")
    chat.addThreadMessage("Alice", "Отлично!", parentMessageId = 4)

    chat.printChat()
}