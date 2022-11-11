package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // DECLARE THE VARIABLES
        val nameET = findViewById<EditText>(R.id.nameET)
        val emailET = findViewById<EditText>(R.id.emailET)
        val phoneET = findViewById<EditText>(R.id.phoneET)
        val saveBUTTON = findViewById<Button>(R.id.saveBUTTON)

        // HANDLE BUTTON CLICKS
        saveBUTTON.setOnClickListener {

            // GET TEXT FROM EDI-TEXT
            var name = nameET.text.toString()
            var email = emailET.text.toString()
            var phone = phoneET.text.toString()

            // INTENT TO START ACTIVITY
            val intent = Intent (this@MainActivity, SecondActivity::class.java)
            intent.putExtra ("Name",name )
            intent.putExtra ("Email",email)
            intent.putExtra ("Phone",phone)
            startActivity(intent)
        }
    }
}