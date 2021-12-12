package com.example.dot_note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AreYou : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_are_you)

        val click = findViewById<Button>(R.id.next)


        click.setOnClickListener {
            startActivity(Intent(this, Interests::class.java))
        }
    }
}