package com.example.thefitu

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class foodactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodactivity)
        val listView:ListView=findViewById(R.id.list)
        val title=resources.getStringArray(R.array.title_story)
        val details =resources.getStringArray(R.array.details)
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.row,R.id.rtext,title)
        listView.adapter=adapter
        listView.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            val t :String=details[position]
            val intent = Intent(applicationContext, foodactivitydetails::class.java)
            intent.putExtra("titles",t)
            startActivity(intent)
        }
    }
}