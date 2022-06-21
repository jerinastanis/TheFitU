package com.example.thefitu

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.text.method.NumberKeyListener
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val intent=intent
        val btnvalue=intent.getStringExtra("value")
        val intval= Integer.valueOf(btnvalue)
        var Timerunning:Boolean?=null
        var Timeleft:Long?=null
        var ctntimer: CountDownTimer?=null
        when (intval) {
            1 -> setContentView(R.layout.activity_1)
            2 -> setContentView(R.layout.activity_2)
            3 -> setContentView(R.layout.activity_3)
            4 -> setContentView(R.layout.activity_4)
            5 -> setContentView(R.layout.activity_5)
            6 -> setContentView(R.layout.activity_6)
            7 -> setContentView(R.layout.activity_7)
            8 -> setContentView(R.layout.activity_8)
            9 -> setContentView(R.layout.activity_9)
            10 -> setContentView(R.layout.activity_10)
            11 -> setContentView(R.layout.activity_11)
            12 -> setContentView(R.layout.activity_12)
            13 -> setContentView(R.layout.activity_13)
            14 -> setContentView(R.layout.activity_14)
            15 -> setContentView(R.layout.activity_15)
        }
        val start:Button=findViewById(R.id.startbtn)
        val textView:TextView=findViewById(R.id.time)
        fun stopTimer(){
            ctntimer?.cancel()
            Timerunning=false
            start.setText("START")
        }
        fun updatetimer(){
            val min: Long = Timeleft!! /60000
            val sec: Long = Timeleft!!%60000 /1000
            var timelefttext:String=""
            if(min<10)
                timelefttext="0"
            timelefttext= timelefttext+min+":"
            if(sec<10)
                timelefttext+="0"
            timelefttext+=sec
            textView.text = timelefttext
        }
        fun startTimer() {
            val charSequence: CharSequence = textView.text
            val num: String = charSequence.toString()
            val num1: String = num.subSequence(0, 2) as String
            val num2: String = num.subSequence(3, 5) as String
            val number: Int = Integer.valueOf(num1) * 60 + Integer.valueOf(num2)
            Timeleft = (number * 1000).toLong()
            ctntimer = object : CountDownTimer(Timeleft!!, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    Timeleft = millisUntilFinished
                    updatetimer()
                }

                override fun onFinish() {
                    var new: Int = Integer.valueOf(btnvalue) + 1
                    if (new <= 7) {
                        val intent = Intent(applicationContext, ThirdActivity::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                        intent.putExtra("value", new.toString())
                        startActivity(intent)
                    } else {
                        new = 1
                        val intent = Intent(applicationContext, ThirdActivity::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                        intent.putExtra("value", new.toString())
                        startActivity(intent)


                    }
                }
            }.start()
            start.setText("PAUSE")
            Timerunning = true
        }

        start.setOnClickListener(){
            if(Timerunning==true){
                stopTimer()
            }
            else{
                startTimer()
            }
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}

