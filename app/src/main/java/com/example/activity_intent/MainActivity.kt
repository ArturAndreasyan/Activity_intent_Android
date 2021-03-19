package com.example.activity_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val selectButton = findViewById<Button>(R.id.SelectButton)
        val nextButton = findViewById<Button>(R.id.NextActivityButton)
        val number = findViewById<TextView>(R.id.textView2)
        selectButton.setOnClickListener {
            number.text = (number.text.toString().toInt() + 1).toString()
        }
        nextButton.setOnClickListener {
            val intent =Intent(this,selectButton::class.java)
            intent.putExtra("text",number.text.toString())
            startActivity(intent)
        }
    }
}