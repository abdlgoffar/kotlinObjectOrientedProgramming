package data

open class CityGovernment {
    open val name: String? = "Surakarta"

    open fun hello(): Unit {
        println("Hello Surakarta")
    }
}


class Mayor: CityGovernment() {
    override val name: String? = "Djokowi"

    override fun hello(): Unit {
        println("Hello Djokowi")
    }

    //contoh cara penggunann keyword super
    fun getYourArea(): Unit {
        println("Area: ${super.name}")
        super.hello()
    }
}

fun main() {
    val cityGovernment: CityGovernment = CityGovernment()
    println("CityGovernment " + cityGovernment.name)
    cityGovernment.hello()


    val mayor: Mayor = Mayor()
    mayor.getYourArea()
}