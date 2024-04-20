package ehr.multiverse.kotlinbasics

class Dog (val name: String = "", val breed: String = "poodle", var age: Int = 1) {


    init{
        bark(name)
    }
    fun bark(name: String){
        println("$name Woof! Woof!")
    }
}