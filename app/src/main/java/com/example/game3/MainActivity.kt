package com.example.game3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//this button (Let's have fun) will take us to the following page in which the user can interact with the app.
        val second_act_btn = findViewById<Button>(R.id.second_act_btn)
        second_act_btn.setOnClickListener {
            val intent = Intent(this, SecondPage ::class.java)
            startActivity(intent)
//Done with the first phase//
        }
        //Declaring the following.
        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {  }

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setOnClickListener{  }
    }
}