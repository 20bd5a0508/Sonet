package com.example.ktdemo1

fun main (){
  val n:Int=22
  var a=-20..30
  var output: String? ="null"
  output=if(a.elementAt(n) >0)
   "positive"
  else
    "negative"
  //print(output)
  var str:String?= "hello"
  print(str)
  print("\n $output\n")
  var o:Any="hello"
  var p:Any
  p= if (o === 0) {
    1
  } else if (o === 'a') {
    'a'
  } else if (o === str){
    "String"
  }else
    true
  when(p){
    1-> print("number")
    'a'-> print("char")
    true-> print("bool")
    "String"->print(str)
  }

}


