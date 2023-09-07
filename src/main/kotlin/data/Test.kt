package data

class Test {

    fun hello(name: String): Unit {
        if (name.isBlank()) {
            throw RuntimeException("name cannot is blank")
        } else {
            println("hello $name")
        }
    }
}

fun main() {

    //contoh cara pembuatan block try catch
    try {
        val test: Test = Test()
        test.hello(" ")
    } catch (e: RuntimeException) {
        println(e.message)
    }
}