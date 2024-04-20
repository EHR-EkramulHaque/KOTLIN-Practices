package ehr.multiverse.kotlinbasics

fun main(){
    val fruitsList = mutableListOf("Apple", "Grapes", "Pineapple", "Orange", "Mango")
    println(fruitsList)

    fruitsList.add("Jack-fruit")
    println(fruitsList)

    fruitsList.remove("Grapes")
    println(fruitsList)

    if(fruitsList.contains("Strawberry"))
    {
        println("Found the fruits")
    }
    else
    {
        println("Fruits not Found")
    }
}