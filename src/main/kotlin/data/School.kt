package data

open class School {

    //cara membuat method overriding yaitu method yang bisa ditimpa oleh class child nya, cukup memberi keyword open
    open fun hello(): Unit {
        println("hello parent")
    }
}

class Student: School() {
    //lalu pada method class child cukup beri keyword override
    override fun hello(): Unit {
        println("hello child")
    }
}

fun main() {
    val school: School = School()
    school.hello()

    val student: Student = Student()
    student.hello()
}