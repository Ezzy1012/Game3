package com.example.game3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Feedstart : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedstart)
//this is the (feed button) will take us to the Feed-end page.
        val play_page_btn = findViewById<Button>(R.id.play_page_btn)
        play_page_btn.setOnClickListener {
            intent = Intent(this, Playend::class.java)
            startActivity(intent)
        }
//this button (back button) will take us back to the second page.
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