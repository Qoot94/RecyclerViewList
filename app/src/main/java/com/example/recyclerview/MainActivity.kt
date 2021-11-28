package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var addButton: Button
    lateinit var inputText: EditText

    private var items = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      // val colors = ArrayList("Red", "Orange", "Yellow", "Green", "Blue", "Indigo")



        addButton = findViewById(R.id.btAdd)
        inputText = findViewById(R.id.editText)

        addButton.setOnClickListener {
            adding()

        }
    }

fun adding(){
    val myRv = findViewById<RecyclerView>(R.id.rvMain)
    myRv.adapter = RecyclerViewAdapter(items)
    myRv.layoutManager = LinearLayoutManager(this)
    items.add(inputText.text.toString())
    inputText.text.clear()
}
}