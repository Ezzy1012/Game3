package com.example.game3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class PlayPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_page)
//this button (play) will take us to the play-end page which will then have a button to make daffy happy//
        val play_page_btn = findViewById<Button>(R.id.play_page_btn)
        play_page_btn.setOnClickListener {
            intent = Intent(this, Playend::class.java)
            startActivity(intent)
        }
//this button (back) will take us back to the second page//
        val play_page_btn_back_btn = findViewById<Button>(R.id.play_page_btn_back_btn)
        play_page_btn_back_btn.setOnClickListener {
            intent = Intent(this, SecondPage::class.java)
            startActivity(intent)
        }
//Done with the first phase//
        //Declaring the components
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setOnClickListener {  }

        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {  }
    }
}