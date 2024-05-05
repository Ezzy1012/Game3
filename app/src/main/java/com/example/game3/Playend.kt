package com.example.game3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Playend : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playend)
//The following button (back) takes the user back to the second page after meeting the requirements of their pet.//
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            intent = Intent(this,SecondPage::class.java)
            startActivity(intent)
        }
        val textView = findViewById<TextView>(R.id.textView3)
        textView.setOnClickListener {  }

        val imageView = findViewById<ImageView>(R.id.imageView3)
        imageView.setOnClickListener {  }
    }
}
//Done with the first phase//