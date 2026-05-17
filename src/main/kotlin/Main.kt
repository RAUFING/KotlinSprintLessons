package org.example

class QuizElement(Question: String, Answer: String) {
    val question: String = Question
        get() = field

    var answer: String = Answer
        get() = field
        set(value) {
            field = value
        }
}