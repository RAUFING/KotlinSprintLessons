package org.example

class QuizElement(
    question: String,
    answer: String,
) {
    var question: String = question
        get() = field
        private set

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}