package com.example.normallist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView =findViewById<ListView>(R.id.helloworld)
        val array = arrayOf("Sachin","Kumar","Gupta")
        val adapter =  ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,array)
         listView.adapter=adapter
    }
}