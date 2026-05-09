package org.example

class User(
    val nickname: String,
    val avatarUrl: String
)

class Participant(
    val user: User,
    var status: String = "пользователь заглушен"
)

class Room(
    val coverUrl: String,
    val title: String,
    val participants: MutableList<Participant> = mutableListOf()
) {
    fun addParticipant(user: User) {
        participants.add(Participant(user))
    }

    fun updateStatus(nickname: String, newStatus: String) {
        participants.find { it.user.nickname == nickname }?.status = newStatus
    }

    fun printInfo() {
        println("Комната: $title")
        println("Участники:")
        for (participant in participants) {
            println("- ${participant.user.nickname} [${participant.status}]")
        }
    }
}

fun main() {
    val room = Room(
        coverUrl = "https://example.com/covers/kotlin.png",
        title = "Kotlin Community"
    )

    room.addParticipant(User(nickname = "rauf", avatarUrl = "https://example.com/avatars/rauf.png"))
    room.addParticipant(User(nickname = "ivan_dev", avatarUrl = "https://example.com/avatars/ivan.png"))

    room.updateStatus("rauf", "разговаривает")
    room.updateStatus("ivan_dev", "микрофон выключен")

    room.printInfo()
}