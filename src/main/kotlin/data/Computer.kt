package data

open class Computer {
    open val name: String? = "electronic material"
}

class Lenovo: Computer() {
    override val name: String? = "Lenovo computer manufacturer"
}

class Asus: Computer() {
    override val name: String? = "Asus computer manufacturer"
}

fun main() {

    //contoh pembuatan type data Any dalam parameter sebuah method.
    fun test(any: Any): Unit {

        //contoh penggunaan is operator sebagai operator pengecekan apakah sebuah data object merupakan type data object dari data object tertentu.
        if (any is Computer) {
            println(any.name)
        } else if (any is Lenovo) {
            println(any.name)
        } else if (any is Asus) {
            println(any.name)
        }
    }


    val computer: Computer = Computer()
    val lenovo: Lenovo = Lenovo()
    val asus: Asus = Asus()


    test(lenovo)

    //contoh penggunaan is operator sebagai operator pengecekan apakah sebuah data object merupakan turunan dari data object tertentu.
    println(asus is Computer)
}