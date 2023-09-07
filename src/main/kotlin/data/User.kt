package data

class AuthException(message: String): Throwable(message)

class User {

    fun login(name: String, pwd: String): Unit {

        //contoh cara pembuatan exception
        if (name.isBlank() || pwd.isBlank()) {
            throw AuthException("login failed")
        } else {
            println("login successfully")
        }
    }
}

fun main() {
    val user1: User = User()
    user1.login("", "123") //error exception

    val user2: User = User()
    user2.login("abdul goffar", "123") //succes

}