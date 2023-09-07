package data

//class Automotive sebagai class parent
//cara untuk membuat class menjadi sebuah class parent maka harus diberi keyword open
open class Automotive {
    val name: String? = null
    val factory: String? = null

    fun getNameAndFactory(): Unit {
        println("${this.name} ${this.factory}")
    }
}

//cara untuk membuat class child
class Car: Automotive() {

}

//cara untuk membuat class child
class Motorcycle: Automotive() {

}
fun main() {
    val motorcycle: Motorcycle = Motorcycle()
    println(motorcycle.name)

    val car: Car = Car()
    println(car.name)
}