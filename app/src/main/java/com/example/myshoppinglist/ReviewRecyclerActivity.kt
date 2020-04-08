package com.example.myshoppinglist

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_review_recycler.*

class ReviewRecyclerActivity: AppCompatActivity() {
    private lateinit var item: SampleData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_recycler)
        setSupportActionBar(toolbar)
        item = intent.getSerializableExtra("data") as SampleData
        fab.setOnClickListener{view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
