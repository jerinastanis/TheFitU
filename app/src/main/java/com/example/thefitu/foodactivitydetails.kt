package com.example.thefitu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class foodactivitydetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodactivitydetails)
        val textView:TextView=findViewById(R.id.txt)
        val details =intent.getStringExtra("titles")
        textView.setText(details)
    }
}