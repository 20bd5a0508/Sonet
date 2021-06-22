package com.example.ktdemo1
class car :vechile{
    override var name: String ="Ford"
    override var mediumOfTravel: String="Land"
    override var wheels: Int= 4
    override fun display() {
        println("This is $name it have $wheels wheels and runs on $mediumOfTravel")
        m1()
    }
    fun m1(){
        println("Hello")
    }
}
