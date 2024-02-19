package ehr.multiverse.kotlinbasics

fun main(){
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val result = add(num1,num2)
    println("Sum of $num1 and $num2 is : $result")

    println("Division of $num1 and $num2 is : " + divide(num1,num2))
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}
//Testing
fun divide(num1 : Int, num2 : Int) : Double{
    return num1.toDouble()/num2
}