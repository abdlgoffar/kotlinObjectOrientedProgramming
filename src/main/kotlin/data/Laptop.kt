package data

class Laptop {

    //contoh cara penggunaan lateinit.
    lateinit var name: String

    fun initialization(): Unit {
            this.name = "Lenovo Ideaped Slim 2303xxxx304"
    }
}

fun main() {

    val laptop: Laptop = Laptop()
    laptop.initialization()
    println(laptop.name)
}