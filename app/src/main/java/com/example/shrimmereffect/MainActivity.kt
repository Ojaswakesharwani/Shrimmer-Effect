package com.example.shrimmereffect

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerViewHorizontal: RecyclerView
    private lateinit var recyclerViewVertical: RecyclerView
    private lateinit var shimmerHorizontal: ShimmerFrameLayout
    private lateinit var shimmerVertical: ShimmerFrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        recyclerViewHorizontal = findViewById(R.id.recyclerViewHorizontal)
        recyclerViewVertical = findViewById(R.id.recyclerViewVertical)
        shimmerHorizontal = findViewById(R.id.shimmerHorizontal)
        shimmerVertical = findViewById(R.id.shimmerVertical)

        val sampleData = listOf(
            DataItem(R.drawable.img3, "Ananya Sharma", "UI/UX Designer"),
            DataItem(R.drawable.img, "Aarav Singh", "Software Developer"),
            DataItem(R.drawable.img4, "Priya Verma", "Data Analyst"),
            DataItem(R.drawable.img2, "Rohan Mehta", "Product Manager"),
            DataItem(R.drawable.img5, "Ishita Kapoor", "QA Engineer")
        )


        // Initially hide real recycler views
        recyclerViewHorizontal.visibility = RecyclerView.GONE
        recyclerViewVertical.visibility = RecyclerView.GONE

        // Show shimmer
        shimmerHorizontal.startShimmer()
        shimmerVertical.startShimmer()

        // Simulate delay
        Handler(Looper.getMainLooper()).postDelayed({
            shimmerHorizontal.stopShimmer()
            shimmerVertical.stopShimmer()

            shimmerHorizontal.visibility = View.GONE
            shimmerVertical.visibility = View.GONE

            recyclerViewHorizontal.visibility = RecyclerView.VISIBLE
            recyclerViewVertical.visibility = RecyclerView.VISIBLE

            recyclerViewHorizontal.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
            recyclerViewHorizontal.adapter = HorizontalAdapter(sampleData)

            recyclerViewVertical.layoutManager = LinearLayoutManager(this)
            recyclerViewVertical.adapter = VerticalAdapter(sampleData)
        }, 2000)
    }
}