package com.example.ktdemo1

class Courseclass(val courseId:String,val title:String) {
    override fun toString(): String {
        return title
    }
}
fun main(){
    var c=Courseclass("S2019","kotlin")
    print(c)
}