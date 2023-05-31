package com.owoko.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listViewyangu=findViewById<ListView>(R.id.mylistview)
        val nchi= arrayOf("Kenya","Tanzania","Uganda","Ethiopia","Rwanda","Burundi")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,nchi)
        listViewyangu.adapter=arrayAdapter

        listViewyangu.setOnItemClickListener{ adapterView, view, position , l ->
            Toast.makeText(this,"You have clicked on " +nchi[position],Toast.LENGTH_LONG).show()
        }
    }
}