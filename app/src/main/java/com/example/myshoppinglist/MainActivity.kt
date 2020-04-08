package com.example.myshoppinglist

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SampleInteractionCallBack {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(Mtc_list){
            layoutManager= LinearLayoutManager( this@MainActivity)
            adapter= SampleRecyclerAdapter(setData(), callBack = this@MainActivity)
        }
    }
    private fun setData(): List<SampleData>{
        return listOf(
            SampleData("Corporate", itemImage = R.drawable.corporate, itemdescription = "Two piece monochrome"),
            SampleData("Jacket", itemImage = R.drawable.jacket, itemdescription =  "Bright yellow straight cut"),
            SampleData("Casual", itemImage = R.drawable.casual, itemdescription = "Orange pencil gown"),
            SampleData("Play-date", itemImage = R.drawable.play_date, itemdescription =  "Floral petite gown"),
            SampleData("Dinner-date", itemImage =  R.drawable.dinner, itemdescription = "Burgundy strapless gown")
        )
    }
    override fun onClick(item: SampleData) {
        Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show()
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("data", item)
        }
        startActivity(intent)
    }
}
