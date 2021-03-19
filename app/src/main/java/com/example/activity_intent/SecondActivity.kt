package com.example.activity_intent

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val buttonSelect = findViewById<Button>(R.id.SelectButton)
        val text = intent.getStringExtra("text")
        val textView = findViewById<TextView>(R.id.textView2)
        textView.text = text
        buttonSelect.setOnClickListener {
            textView.text = (textView.text.toString().toInt() - 1).toString()
        }
    }
}