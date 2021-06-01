package com.example.ktdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var bt=findViewById<Button>(R.id.but1)
        var ext=findViewById<EditText>(R.id.edtxt1)
        var text4=findViewById<TextView>(R.id.Text4)
        bt.setOnClickListener(View.OnClickListener {
            var num:Int=ext.text.toString().toInt()
            var s:String=" "
            var i:Int=1
            while(true){
                if(i==num+1)
                    break
                s+="@$i"
                i++
            }
            text4.setText("RESULT $s")
            ext.setText("")
        })

    }
}