package data


//contoh pembuatan enum class
enum class Gender {
    MALE, FEMALE
}

fun main() {
    val man: Gender = Gender.MALE
    val woman: Gender = Gender.FEMALE

    val genders: Array<Gender> = Gender.values()
    println(genders[0])
}