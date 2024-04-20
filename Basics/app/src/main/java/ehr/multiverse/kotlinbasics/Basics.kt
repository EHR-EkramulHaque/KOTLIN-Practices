package ehr.multiverse.kotlinbasics

fun main(){

    val daisy = Dog("Daisy")
    println("Daisy Breed is ${daisy.breed}\n")

    daisy.age=12
    println("Daisy age is ${daisy.age}\n")
    println("Hel gsg lo Ekramul")

//    val myBook = Book()
//    println("Title of Book : ${myBook.title}")
//    println("Author of Book : ${myBook.author}")
//    println("Published Year of Book : ${myBook.yearPublished}\n")

//    val customBook = Book("Iman Sobar Age", "Abdul Malek Shab (DB.)", 2013)
//    println("Title of Book : ${customBook.title}")
//    println("Author of Book : ${customBook.author}")
//    println("Published Year of Book : ${customBook.yearPublished}\n")
}
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun divide(num1 : Int, num2 : Int) : Double{
    return num1.toDouble()/num2
}