package com.test.myapplication

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Listview : AppCompatActivity() {
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        listView = findViewById(R.id. listView)

        val language:Array<String> = resources.getStringArray(R.array.array_technology)
        val arrayAdapter =ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,language)
        listView.adapter = arrayAdapter
        listView.onItemClickListener= AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            Toast.makeText(applicationContext,"click item $selectedItem its position $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }
    }
}
