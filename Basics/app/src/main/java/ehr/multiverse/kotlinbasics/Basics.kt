package ehr.multiverse.kotlinbasics

data class CoffeeDetails(
    val sugarCount:Int,
    val name:String,
    val size:String,
    val creamAmount:Int
)
fun main(){

    val coffeeForDenis = CoffeeDetails(0, "Denis", "xxl",0)
    makeCoffee(coffeeForDenis)

//    val daisy = Dog("Daisy")
//    println("Daisy Breed is ${daisy.breed}\n")
//
//    daisy.age=12
//    println("Daisy age is ${daisy.age}\n")


//    val myBook = Book()
//    println("Title of Book : ${myBook.title}")
//    println("Author of Book : ${myBook.author}")
//    println("Published Year of Book : ${myBook.yearPublished}\n")

//    val customBook = Book("Iman Sobar Age", "Abdul Malek Shab (DB.)", 2013)
//    println("Title of Book : ${customBook.title}")
//    println("Author of Book : ${customBook.author}")
//    println("Published Year of Book : ${customBook.yearPublished}\n")
}

fun makeCoffee(coffeeDetails: CoffeeDetails){
    if(coffeeDetails.sugarCount==1)
    {
        println("Coffee With ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
    }
    else if(coffeeDetails.sugarCount==0)
    {
        println("Coffee with no sugar for ${coffeeDetails.name}")
    }
    else
    {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for${coffeeDetails.name}")
    }
}