package com.example.thefitu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.Toolbar

class SecondActivity2 : AppCompatActivity() {
    val num = arrayOf<Int>(R.id.mountain,
        R.id.crunches,
        R.id.bench,
        R.id.bicycle,
        R.id.leg,
        R.id.heel,
        R.id.legup,
        R.id.squats,
        R.id.vups,
        R.id.hand,
        R.id.plank,
        R.id.twist,
        R.id.bridge,
        R.id.vertical,
        R.id.wind)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
    }

    fun imgbtnclicked(view: View) {
        for (i in 0..num.size-1)
        {
            if(view.id==num[i]){
                val value=i+1
                Log.i("First", value.toString())
                val intent = Intent(this, ThirdActivity2::class.java)
                intent.putExtra("value",value.toString())
                startActivity(intent)
            }
        }
    }
}