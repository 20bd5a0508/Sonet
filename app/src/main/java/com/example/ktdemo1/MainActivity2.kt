package com.example.ktdemo1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var layout=findViewById<ConstraintLayout>(R.id.contain)
        var btn=findViewById<Button>(R.id.cbtn)
        var spinner=findViewById<Spinner>(R.id.spinner)
        btn.setOnClickListener(View.OnClickListener {
            var ab=spinner.selectedItem.toString()
            when(ab){
                "Red"->layout.setBackgroundColor(Color.RED)
                "Yellow"->layout.setBackgroundColor(Color.YELLOW)
                "Blue"->layout.setBackgroundColor(Color.BLUE)
                "Green"->layout.setBackgroundColor(Color.GREEN)
            }
        })
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity2> {
        override fun createFromParcel(parcel: Parcel): MainActivity2 {
            return MainActivity2(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity2?> {
            return arrayOfNulls(size)
        }
    }
}