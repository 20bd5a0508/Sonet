package com.example.ktdemo1

class ListDemo {
    var names= listOf<String>("sai","sai","Arun","saketh","mahender","Ankith","manish")
    fun display(){
       /* println(names[2])
        println(names.get(1))
        names.add("vamshi")
        names.add("sai")*/
        for (a in names)
            print("$a ")
    }
}
fun main(){
    var l:ListDemo= ListDemo()
    l.display()
}