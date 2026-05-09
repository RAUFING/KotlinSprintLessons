package lesson11

fun main() {
    val user1 = User(1, "Misha47", "5EWK4efffu", "misha@4chan.com")
    val user2 = User(2, "Danya228", "ug85n394", "danyachan@4chan.com")
    println("Данные пользователя ${user1.id}: логин - ${user1.login}, пароль - ${user1.password}, email - ${user1.email}")
}