package com.example.intentapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // GET DATA FROM INTENT
        var intent = intent
        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")
        val phone = intent.getStringExtra("Phone")

        // TEXTVIEW
        val resultTV = findViewById<TextView>(R.id.resultTV)

        // SET_TEXT
        resultTV.text = "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone
    }
}
