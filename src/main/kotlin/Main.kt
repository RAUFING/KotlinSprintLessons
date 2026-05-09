package org.example

class Participant(
    val nickname: String,
    val avatarUrl: String,
    var status: String,
)

class Room(
    val coverUrl: String,
    val title: String,
    val participants: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun updateStatus(nickname: String, newStatus: String) {
        participants.find { it.nickname == nickname }?.status = newStatus
    }

    fun printInfo() {
        println("Комната: $title")
        println("Участники:")
        for (participant in participants) {
            println("- ${participant.nickname} [${participant.status}]")
        }
    }
}

fun main() {
    val room = Room(
        coverUrl = "https://example.com/covers/kotlin.png",
        title = "Kotlin Community",
    )

    room.addParticipant(Participant(nickname = "rauf", avatarUrl = "https://example.com/avatars/rauf.png", status = "разговаривает"))
    room.addParticipant(Participant(nickname = "ivan_dev", avatarUrl = "https://example.com/avatars/ivan.png", status = "микрофон выключен"))
    room.addParticipant(Participant(nickname = "kotlin_master", avatarUrl = "https://example.com/avatars/master.png", status = "пользователь заглушен"))

    room.updateStatus("rauf", "разговаривает")
    room.updateStatus("ivan_dev", "микрофон выключен")

    room.printInfo()
}