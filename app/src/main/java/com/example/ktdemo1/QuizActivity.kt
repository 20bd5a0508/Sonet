package com.example.ktdemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat


class QuizActivity : AppCompatActivity(),View.OnClickListener {

    private var listofquestions:ArrayList<Questions>?=null
    var currentPos=1
    lateinit var question:TextView

    lateinit var submit:Button
    var selectedchoice:Int=0
    lateinit var optionlist:List<TextView>
    var score:Int=0
    var optionselected:Int=0
    lateinit var end:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        var utility:Utility= Utility()

        listofquestions=utility.getQuestions()
       // utility.getQuestionFromGithub()
        var name: String? =intent.getStringExtra("name")
        var q_name=findViewById<TextView>(R.id.qaname)
        q_name.text=name
         question=findViewById<TextView>(R.id.qaquestion)

         val opt1 =findViewById<TextView>(R.id.tvopt1)
         val opt2=findViewById<TextView>(R.id.tvopt2)
         val opt3=findViewById<TextView>(R.id.tvopt3)
         val opt4=findViewById<TextView>(R.id.tvopt4)
        val progressBar = findViewById<ProgressBar>(R.id.qapro)
        progressBar.max=listofquestions!!.size
        progressBar.progress=currentPos
        submit=findViewById<Button>(R.id.qanext)
        end=findViewById<Button>(R.id.qaend)
        end.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,SonetQuiz()::class.java)
            startActivity(intent)
        })

        optionlist= listOf<TextView>(opt1,opt2,opt3,opt4)
        setQuestions();
        for (option in optionlist){
            option.setOnClickListener(this)
        }
        submit.setOnClickListener(View.OnClickListener {
           var ans:Int= listofquestions!!.get(currentPos-1).answer
            val btntext:String=submit.text.toString()
            when(btntext){
                "SUBMIT"->{
                    if (optionselected==1) {
                        checkAnswer(ans, selectedchoice);

                        for (option in optionlist) {
                            option.setClickable(false)
                        }

                        if (listofquestions!!.size == currentPos) {
                            submit.setText("FINISH")
                        } else {
                            submit.setText("NEXT")
                        }

                    }
                    else{
                        Toast.makeText(this,"choose a option",Toast.LENGTH_SHORT).show()
                    }

                }
                "NEXT" ->{
                    currentPos++
                    optionselected=0
                    setQuestions()
                    for (option in optionlist){
                        option.setClickable(true)
                    }
                    progressBar.progress=currentPos
                }
                "FINISH" ->{
                    optionselected=0
                    Toast.makeText(this,"Your score is $score",Toast.LENGTH_LONG).show()
                    var intent = Intent(this,SonetQuiz()::class.java)
                    startActivity(intent)
                    finish()
                }
            }

        })

    }
    private fun checkAnswer(ans:Int,selectedchoice:Int){
       when(selectedchoice){
        1 ->{
              optionlist.get(selectedchoice-1).background=ContextCompat.getDrawable(this,R.drawable.wrong_option_color)
              optionlist.get(ans-1).background=ContextCompat.getDrawable(this,R.drawable.right_option_color)
        }
         2 ->{
             optionlist.get(selectedchoice-1).background=ContextCompat.getDrawable(this,R.drawable.wrong_option_color)
             optionlist.get(ans-1).background=ContextCompat.getDrawable(this,R.drawable.right_option_color)

        }
        3 ->{
            optionlist.get(selectedchoice-1).background=ContextCompat.getDrawable(this,R.drawable.wrong_option_color)
            optionlist.get(ans-1).background=ContextCompat.getDrawable(this,R.drawable.right_option_color)

        }
        4 ->{
            optionlist.get(selectedchoice-1).background=ContextCompat.getDrawable(this,R.drawable.wrong_option_color)
            optionlist.get(ans-1).background=ContextCompat.getDrawable(this,R.drawable.right_option_color)

          }
    }
        if (ans==selectedchoice){
            score+=1
        }
    }
    fun setQuestions(){
        var questionobj=listofquestions!!.get(currentPos-1)
        question.text=questionobj.question
        optionlist.get(0).text=questionobj.opt1
        optionlist.get(1).text=questionobj.opt2
        optionlist.get(2).text=questionobj.opt3
        optionlist.get(3).text=questionobj.opt4
        defaultOption()
        submit.setText("SUBMIT")

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.tvopt1 ->{
                selectedoption(optionlist.get(0),R.drawable.selected_option_color)
                selectedchoice=1
                optionselected=1
            }
            R.id.tvopt2 ->{
                selectedoption(optionlist.get(1),R.drawable.selected_option_color)
                selectedchoice=2
                optionselected=1
            }
            R.id.tvopt3 ->{
                selectedoption(optionlist.get(2),R.drawable.selected_option_color)
                selectedchoice=3
                optionselected=1
            }
            R.id.tvopt4 ->{
                selectedoption(optionlist.get(3),R.drawable.selected_option_color)
                selectedchoice=4
                optionselected=1
            }


        }

    }
    private fun selectedoption(t: TextView,id:Int){
        defaultOption()
        t.background= ContextCompat.getDrawable(this,R.drawable.selected_option_color)
        selectedchoice=id
    }
    private fun defaultOption(){
        optionlist.get(0).background= ContextCompat.getDrawable(this,R.drawable.selected_option_color)
        optionlist.get(1).background= ContextCompat.getDrawable(this,R.drawable.selected_option_color)
        optionlist.get(2).background= ContextCompat.getDrawable(this,R.drawable.selected_option_color)
        optionlist.get(3).background= ContextCompat.getDrawable(this,R.drawable.selected_option_color)
    }

}