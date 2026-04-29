package org.example

fun main() {
    var trainingDay = 5
    val isArmsAndAbsDay = trainingDay % 2 != 0
    val isLegsAndBackDay = trainingDay % 2 == 0

    println(
        "Упражнения для рук: $isArmsAndAbsDay\n" +
            "Упражнения для ног: $isLegsAndBackDay\n" +
            "Упражнения для спины: $isLegsAndBackDay\n" +
            "Упражнения для пресса: $isArmsAndAbsDay",
    )
}
