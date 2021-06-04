package com.example.ktdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        var name=findViewById<EditText>(R.id.namema6)
        var gen=findViewById<EditText>(R.id.genderma6)
        var age=findViewById<EditText>(R.id.agema6)
        var btn=findViewById<Button>(R.id.btnma6)


        btn.setOnClickListener(View.OnClickListener {
            val person:Person=Person()
            person.name=name.text.toString()
            person.gender=gen.text.toString()
            person.age=age.text.toString().toInt()
            var res=if (person.age!= 0) "${person.name}" else "person is minor"

            Toast.makeText(applicationContext,res,Toast.LENGTH_LONG).show()
        })
    }
}