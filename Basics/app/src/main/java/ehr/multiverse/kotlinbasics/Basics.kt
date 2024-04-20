package ehr.multiverse.kotlinbasics
fun main(){

    listExample()

    /*
    val coffeeForDenis = CoffeeDetails(0, "Denis", "xxl",0)
    makeCoffee(coffeeForDenis)

    val daisy = Dog("Daisy")
    println("Daisy Breed is ${daisy.breed}\n")

    daisy.age=12
    println("Daisy age is ${daisy.age}\n")


    val myBook = Book()
    println("Title of Book : ${myBook.title}")
    println("Author of Book : ${myBook.author}")
    println("Published Year of Book : ${myBook.yearPublished}\n")

    val customBook = Book("Iman Sobar Age", "Abdul Malek Sh-ab (DB.)", 2013)
    println("Title of Book : ${customBook.title}")
    println("Author of Book : ${customBook.author}")
    println("Published Year of Book : ${customBook.yearPublished}\n")
    */
}

fun listExample(){
    //val shoppingList0 = listOf("Processor", "SSD", "RAM") // Immutable List. Can not add or modify
    val shoppingList = mutableListOf("Processor", "SSD", "RAM") // mutable List. Can add or modify

    shoppingList.add("Colling System") // adding items to lists
    shoppingList.add(1,"DVD")
    shoppingList.remove("SSD") // Remove value
    shoppingList.removeAt(0)

    println(shoppingList) //Print list
    println(shoppingList[2]) //Print specific item of list

    shoppingList[2] = "Graphics Card"
    println(shoppingList) //Print specific item of list

    shoppingList.set(0,"SSD")
    println(shoppingList)


    if(shoppingList.contains("SSD"))
    {
        println("There is SSD\n")
    }
    else
    {
        println("No SSD\n")
    }


    for(item in shoppingList)
    {
        println(item)
        if(item ==  "RAM")
        {
            break
            //shoppingList.removeFirst()
        }
    }

    for(index in 0 until shoppingList.size) // start until end it represent start <= x < end
    {
        println("Item ${shoppingList[index]} is at index $index")
    }
    /*for(index in 0..shoppingList.size) // start..end it represent start <= x <= end
    {
        println("Item ${shoppingList[index]} is at index $index")
    }*/

    //println(shoppingList.size)
    println(shoppingList)
}

/*
data class CoffeeDetails(
    val sugarCount:Int,
    val name:String,
    val size:String,
    val creamAmount:Int
)

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
*/
