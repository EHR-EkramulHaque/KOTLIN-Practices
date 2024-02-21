package ehr.multiverse.kotlinbasics

fun main(){

    var daisy = Dog("Daisy")
    println("Daisy Breed is ${daisy.breed}")
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun divide(num1 : Int, num2 : Int) : Double{
    return num1.toDouble()/num2
}