package com.example.ktdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.btn)
        var txt1=findViewById<TextView>(R.id.txt1)
        var flag=false
        var ptxt1=findViewById<EditText>(R.id.pt1)
        btn.setOnClickListener(View.OnClickListener {
            var radius=ptxt1.text.toString().toDouble()
            val pi=3.14285
            var area =pi*radius*radius
            txt1.setText("Area of circle:$area")




        })
    }
}