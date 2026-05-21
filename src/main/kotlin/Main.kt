package org.example

enum class Gender {
    MALE,
    FEMALE,
    ;

    companion object {
        fun fromString(input: String): Gender? = when (input.lowercase()) {
            "м", "m", "муж", "мужской", "male" -> MALE
            "ж", "f", "жен", "женский", "female" -> FEMALE
            else -> null
        }
    }
}

class Person(
    val name: String,
    val gender: Gender,
) {
    fun printInfo() {
        val genderDisplay = when (gender) {
            Gender.MALE -> "Мужской"
            Gender.FEMALE -> "Женский"
        }
        println("$name — $genderDisplay")
    }
}

fun main() {
    println("Картотека v1.0")
    println("Вводите имя и пол через пробел (например: Анна Ж)")
    println("Доступные значения пола: М/Муж/Male или Ж/Жен/Female")
    println()

    val people = buildList {
        for (i in 1..5) {
            while (true) {
                println("Запись $i из 5:")
                val input = readln().trim()
                val parts = input.split(" ")

                if (parts.size != 2) {
                    println("Ошибка! Введите имя и пол через пробел (например: Анна Ж)")
                    continue
                }

                val name = parts[0]
                val gender = Gender.fromString(parts[1])

                if (gender == null) {
                    println("Ошибка! Неверное значение пола. Используйте: М/Муж/Male или Ж/Жен/Female")
                    continue
                }

                add(Person(name, gender))
                break
            }
        }
    }

    println("\nДанные картотеки:")
    for (person in people) {
        person.printInfo()
    }
}