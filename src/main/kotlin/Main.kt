package org.example

fun main() {
    val trainingDay = 5
    val isEven = trainingDay % 2 == 0

    println(
        "Упражнения для рук:    ${!isEven}\n" +
            "Упражнения для ног:    $isEven\n" +
            "Упражнения для спины:  $isEven\n" +
            "Упражнения для пресса: ${!isEven}",
    )
}
