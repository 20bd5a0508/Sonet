package com.example.ktdemo1
import android.util.Log
import java.net.HttpURLConnection
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class Utility{
    fun getQuestions():ArrayList<Questions>{
        var list =ArrayList<Questions>()
        var q1=Questions(1,"What is Kotlin","Scripting language","Programming language","Modern language","Assembly language",3)
        var  q2=Questions(2,"What is Java","Scripting language","Programming language","Modern language","Assembly language",2)
        var q3 = Questions(3,"What is Browser?","Apple software","Google Tool","Desktop/Moibile Client","Language",3)
        list.add(q1)
        list.add(q2)
        list.add(q3)
       // list+=getQuestionFromGithub()

        return list
    }
    fun getQuestionFromGithub():ArrayList<Questions>{
        var list = ArrayList<Questions>()
        //logic
        Thread(Runnable {
            var response:String = URL("https://raw.githubusercontent.com/20bd5a0508/Sonet/main/questions.json").readText()
            Log.i("----> Response : ",response)

        }).start()
        return list
    }
}