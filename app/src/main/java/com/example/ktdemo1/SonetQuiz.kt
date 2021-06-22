package com.example.ktdemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SonetQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonet_quiz)
        var btn=findViewById<Button>(R.id.sqbtn)
        var name=findViewById<EditText>(R.id.sqetxt)
        btn.setOnClickListener( View.OnClickListener {
            Log.i("-------->","hello")
            if(name.text.toString().isEmpty())
                Toast.makeText(this@SonetQuiz,"please enter your name",Toast.LENGTH_LONG).show()
            else{
                var next:Intent= Intent(this,QuizActivity()::class.java)
                next.putExtra("name",name.text.toString())
                startActivity(next)


            }
        })
    }
}