package com.example.ktdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.btn)
        var txt=findViewById<TextView>(R.id.txt)
        var flag=false
        btn.setOnClickListener(View.OnClickListener {
            if(flag){
                txt.setText("hello kotlin")
                flag=false;
            }
            else{
                txt.setText("hello world")
                flag=true
            }
        })
    }
}