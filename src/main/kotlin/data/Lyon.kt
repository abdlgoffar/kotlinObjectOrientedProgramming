package data

//untuk membuat class yang object nya nanti singleton, maka keyword pembuatannya menggunakan keyword object seprti contoh di bawah
object Lyon {
    val height: Int = 3



}

fun main() {
    //singleton object data
    val lyon1 = Lyon.height
    val lyon2 = Lyon.height
}