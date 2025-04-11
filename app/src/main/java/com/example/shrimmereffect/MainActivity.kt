package com.example.shrimmereffect

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerViewHorizontal: RecyclerView
    private lateinit var recyclerViewVertical: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)


        recyclerViewHorizontal = findViewById(R.id.recyclerViewHorizontal)
        recyclerViewVertical = findViewById(R.id.recyclerViewVertical)

        val sampleData = listOf(
            DataItem(R.drawable.img2, "Aarav Singh", "Software Developer"),
            DataItem(R.drawable.img, "Rohan Mehta", "Product Manager"),
            DataItem(R.drawable.img2, "Siddharth Rao", "Backend Developer")
        )

        recyclerViewHorizontal.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHorizontal.adapter = HorizontalAdapter(sampleData)

        recyclerViewVertical.layoutManager = LinearLayoutManager(this)
        recyclerViewVertical.adapter = VerticalAdapter(sampleData)
    }
}