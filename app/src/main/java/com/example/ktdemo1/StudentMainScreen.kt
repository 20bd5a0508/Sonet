package com.example.ktdemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class StudentMainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_main_screen)
        var btn_online=findViewById<Button>(R.id.smc_online)
        btn_online.setOnClickListener(View.OnClickListener {
            var next:Intent =Intent(this,Student_OnlineClasses()::class.java)
            startActivity(next)

        })
    }
}