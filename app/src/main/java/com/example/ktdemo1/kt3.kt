package com.example.ktdemo1

//import kotlin.random.Random
import java.util.*

fun main(){
FeedingManul()
}
fun randomDay():String{
    var day:String=""
    var arr= arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    day= arr[Random().nextInt(arr.size)]
    return day
}
fun FeedingManul(){
    var day:String= randomDay()
    var food= Fishfood(day)
    var changeWater= ChangeWater(day ,30,28)
    println("Today is $day you need to feed $food")
    print("Change Water : ${if(changeWater)"is needed" else "not needed"}")
}
fun Fishfood(Day: String):String{
    var food:String=" "
    when(Day){
        "Monday"->food= "Flakes"
        "Tuesday"-> food= "Pellets"
        "Wednesday"-> food= "Redworms"
        "Thursday"->food="Granules"
        "Friday"->food="Mosquitoes"
        "Saturday"->food= "Lettuce"
        "Sunday"->food="Plankton"
    }
    return food
}

fun ChangeWater(Day:String,Temp:Int=29,DirtSensor:Int=29):Boolean{
return when{
    isHot(Temp)->true
    isDirt(DirtSensor)->true
    issunday(Day)->true
    else ->false
}
}
fun isHot(temp:Int)=temp>30
fun isDirt(dirt:Int)=dirt>30
fun issunday(day:String)=day=="Sunday"