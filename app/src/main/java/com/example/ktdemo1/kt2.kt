package com.example.ktdemo1

fun main(){
    /*var fruit= arrayOf("apple","guava","pineapple")
    for(i in fruit.indices){
        if (i%2==0)
        print(fruit[i]+" ")
    }
    var text:String="hey world"
    var len:Int=1;
    for(l in text){
        if(l==null)
            break
        if(l=='e')
            continue
        len++
    }
    print("Number of letters are: $len")
    q@ for (i in 1..5) {
        w@ for (j in 1..3) {
            if (j == 3) {
                break@w
            }
            print("i=$i  j=$j  ")
        }
        if (i==4)
            break@q
    }
    var st:String="hey "
    st+="world"
    print(st)*/
    main2()
}
fun main2(){
 var a:Int=33
 var b:Int=32
 var s: String? = readLine()
 print(hello(a,b))
 print(s)
}
fun hello(a:Int,b:Int):Int{
    return a*b
}