package com.example.dot_note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Interests : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interests)

        val click = findViewById<Button>(R.id.start)


        click.setOnClickListener {
            startActivity(Intent(this, Settings::class.java))
        }
    }
}