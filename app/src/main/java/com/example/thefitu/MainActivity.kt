package com.example.thefitu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

    }
    fun before18(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
    fun after18(view: View) {
        val intent = Intent(this, SecondActivity2::class.java)
        startActivity(intent)
    }
    fun food(view: View) {
        val intent = Intent(this, foodactivity::class.java)
        startActivity(intent)
    }

}