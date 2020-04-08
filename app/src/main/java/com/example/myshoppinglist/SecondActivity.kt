package com.example.myshoppinglist

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var item: SampleData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        item = intent.getSerializableExtra("data") as SampleData

        Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show()

    }
}
