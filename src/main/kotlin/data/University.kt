package data

open class University {

    //cara membuat properties overriding yaitu properties yang bisa ditimpa oleh class child nya, cukup memberi keyword open
    open val name: String? = "Brawijaya University"
}

class Lecturer: University() {

    //lalu pada properties class child cukup beri keyword override
    override val name: String? = "drs. anton wijaya. skom, m. kom"
}

fun main() {
    val university: University = University()
    println(university.name)

    val lecturer: Lecturer = Lecturer()
    println(lecturer.name)
}