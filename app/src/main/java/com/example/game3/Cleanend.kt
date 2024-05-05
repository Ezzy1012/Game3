package com.example.game3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Cleanend : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cleanend)
//this button will take us to the main page
        val play_page_btn_back_btn = findViewById<Button>(R.id.play_page_btn_back_btn)
        play_page_btn_back_btn.setOnClickListener {
            intent = Intent(this, SecondPage::class.java)
            startActivity(intent)
        }
        val textView = findViewById<TextView>(R.id.textView6)
        textView.setOnClickListener {  }

        val imageView = findViewById<ImageView>(R.id.imageView4)
        imageView.setOnClickListener {  }
    }
}
//Done with this page.