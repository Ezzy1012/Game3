package com.example.game3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Cleanstart : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cleanstart)
//this button will take us back to the main page. (back)

        val play_page_btn_back_btn = findViewById<Button>(R.id.play_page_btn_back_btn)
        play_page_btn_back_btn.setOnClickListener {
            intent = Intent(this, SecondPage::class.java)
            startActivity(intent)
        }
        //this button will take us to the next page. (clean)
        val play_page_btn_back_btn2 = findViewById<Button>(com.google.android.material.R.id.postLayout)
        play_page_btn_back_btn2.setOnClickListener {
            intent = Intent(this,Cleanend::class.java)
            startActivity(intent)
        }
        val imageView = findViewById<ImageView>(R.id.imageView4)
        imageView.setOnClickListener {  }

        val textView = findViewById<TextView>(R.id.textView5)
        textView.setOnClickListener {  }

    }
}