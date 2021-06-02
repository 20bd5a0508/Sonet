package com.example.ktdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var dirt = findViewById<EditText>(R.id.etxtdirt)
        var temp = findViewById<EditText>(R.id.etxttemp)
        var btn = findViewById<Button>(R.id.btnma5)
        var txt=findViewById<TextView>(R.id.txtma5)
        btn.setOnClickListener(View.OnClickListener {
            var d: Int = dirt.text.toString().toInt()
            var t: Int = dirt.text.toString().toInt()

            var res: String = FeedingManul(t, d)
            txt.setText(res)



        })
    }

    fun FeedingManul(temp: Int,dirt: Int): String {
        var day: String = randomDay()
        var food = Fishfood(day)
        var changeWater = ChangeWater(day, temp, dirt)
        var res="Today is $day you need to feed $food \n \nChange Water : ${if (changeWater) "is needed" else "not needed"}"
        return res
    }

    fun randomDay(): String {
        var day: String = ""
        var arr = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        day = arr[Random().nextInt(arr.size)]
        return day
    }

    fun Fishfood(Day: String): String {
        var food: String = " "
        when (Day) {
            "Monday" -> food = "Flakes"
            "Tuesday" -> food = "Pellets"
            "Wednesday" -> food = "Redworms"
            "Thursday" -> food = "Granules"
            "Friday" -> food = "Mosquitoes"
            "Saturday" -> food = "Lettuce"
            "Sunday" -> food = "Plankton"
        }
        return food
    }

    fun ChangeWater(Day: String, Temp: Int = 29, DirtSensor: Int = 29): Boolean {
        return when {
            isHot(Temp) -> true
            isDirt(DirtSensor) -> true
            issunday(Day) -> true
            else -> false
        }
    }

    fun isHot(temp: Int) = temp > 30
    fun isDirt(dirt: Int) = dirt > 30
    fun issunday(day: String) = day == "Sunday"
}