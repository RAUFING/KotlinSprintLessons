class User(val id: Int, val login: String, val password: String, val email: String)

fun main() {
    val user1 = User(1, "userOne", "passOne", "userone@example.com")
    val user2 = User(2, "userTwo", "passTwo", "usertwo@example.com")

    println("User 1: ID=${user1.id}, Login=${user1.login}, Password=${user1.password}, Email=${user1.email}")
    println("User 2: ID=${user2.id}, Login=${user2.login}, Password=${user2.password}, Email=${user2.email}")
}
