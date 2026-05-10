package org.example

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var nextUserId = 1

    fun createNewUser(userName: String): ForumMember {
        val member = ForumMember(userId = nextUserId, userName = userName)
        members.add(member)
        nextUserId++
        return member
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (members.any { it.userId == authorId }) {
            messages.add(ForumMessage(authorId = authorId, message = message))
        }
    }

    fun printThread() {
        for (msg in messages) {
            val author = members.find { it.userId == msg.authorId }
            println("${author?.userName ?: "Unknown"}: ${msg.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val alice = forum.createNewUser("Alice")
    val bob = forum.createNewUser("Bob")

    forum.createNewMessage(alice.userId, "Привет, как дела?")
    forum.createNewMessage(bob.userId, "Привет! Всё отлично.")
    forum.createNewMessage(alice.userId, "Что нового?")
    forum.createNewMessage(bob.userId, "Изучаю Kotlin!")

    forum.printThread()
}