package data

import java.sql.ClientInfoStatus

//contoh membuat constructor sebuah class, cukup memberi class tersebut sebuah tanda kurung lalu masukkan constructor data di dalamnya
class Person(address: String?, country: String?, regency: String?) {


    //contoh sebuah properties
    val name: String? = "Abdul Goffar"
    var age: Int? = 22
    var studentStatus: Boolean? = true

    val address: String? = address
    val country: String? = country
    val regency: String? = regency

    //contoh sebuah init blok
    init {
        println("init blok berhasil di eksekusi")
    }


    //contoh secondary constructor
    constructor(age: Int, studentStatus: Boolean):
            this(null, null, null) {
                this.age = age
                this.studentStatus = studentStatus
            }
}

fun main() {
    //contoh sebuah object
    val goffar: Person = Person("jl. jaksa agung suprapto" ,"indonesia", "kab sampang")
    println(goffar.country)

    val goffar2: Person = Person(23, false)
    println(goffar2.age)
}