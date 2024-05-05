package com.example.game3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class SecondPage : AppCompatActivity() {

    private var maxHealth = 100
    private var currentHealth = 80 // Example initial health

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)


//this first button (play) takes us to the next page (Playpage) which then allows the user to play/interact with the pet.
        val third_act_btn = findViewById<Button>(R.id.third_act_btn)
        third_act_btn.setOnClickListener {
            val intent = Intent(this,PlayPage::class.java)
            startActivity(intent)
        }
//this next button (feed) takes us to the page Feed-start
        val third_act_btn2 = findViewById<Button>(R.id.third_act_btn2)
        third_act_btn2.setOnClickListener {
            val intent = Intent(this,Feedstart::class.java)
            startActivity(intent)
        }
//this button takes the user to the Clean-start page.
        val third_act_btn3 = findViewById<Button>(R.id.third_act_btn3)
        third_act_btn3.setOnClickListener {
            val intent = Intent(this, Cleanstart::class.java)
            startActivity(intent)
        }
        //Declaring the following items.
        val textView = findViewById<TextView>(R.id.textView2)
        textView.setOnClickListener {  }

        val imageView = findViewById<ImageView>(R.id.imageView2)
        imageView.setOnClickListener {  }

        val progressBar = findViewById<ProgressBar>(R.id.healthbar)
        progressBar.setOnClickListener {  }

        val healthBar = findViewById<ProgressBar>(R.id.healthbar)
        healthBar.setOnClickListener {  }

        // Set max value for the progress bar
        healthBar.max = maxHealth

        // Set initial health value
        healthBar.progress = currentHealth

        // Example usage: decrease health by 10
        decreaseHealth(10)
    }

    private fun decreaseHealth(amount: Int) {
        currentHealth -= amount
        if (currentHealth < 0) {
            currentHealth = 0
        }
        healthBar.progress = currentHealth
    }

    }
