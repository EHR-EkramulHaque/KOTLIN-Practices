package ehr.multiverse.kotlinbasics

class Dog (val name: String = "", val breed: String = "poodle") {


    init{
        bark(name)
    }
    fun bark(name: String){
        println("$name Woof! Woof!")
    }
}