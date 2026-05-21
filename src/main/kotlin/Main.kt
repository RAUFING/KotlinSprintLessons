package org.example

fun main(){
    val greet: (String) -> String = { username -> "С наступающим Новым Годом, ${username}!" }
    println(greet("Анна"))
}