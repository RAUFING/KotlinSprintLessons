package org.example

class QuizElement(
    initialQuestion: String,
    initialAnswer: String,
) {
    val question: String = initialQuestion
        get() = field

    var answer: String = initialAnswer
        get() = field
        set(value) {
            field = value
        }
}