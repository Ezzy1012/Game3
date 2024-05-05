package com.example.game3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Feedend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedend)
//this button (back) will take us back to the second page
        val play_page_btn_back_btn = findViewById<Button>(R.id.play_page_btn_back_btn)
        play_page_btn_back_btn.setOnClickListener {
            intent = Intent(this, SecondPage::class.java)
            startActivity(intent)
        }
        val imageView = findViewById<ImageView>(R.id.imageView4)
        imageView.setOnClickListener {  }

        val textView = findViewById<TextView>(R.id.textView5)
        textView.setOnClickListener {  }
    }
}
//Done with this phase.