package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.util.Log

private var reg = true
class MainActivity : AppCompatActivity() {
    // @SuppressLint("WrongViewCast")

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)


        val getinput = findViewById<Button>(R.id.enter)
        val editText = findViewById<EditText>(R.id.gettext)

        getinput.setOnClickListener {
            if (reg) {
                val text = editText.text
                if (text == null) {
                    Toast.makeText(this, "null", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
                    reg = false
                }
            } else {
                Toast.makeText(this, "gg", Toast.LENGTH_SHORT).show()
            }
        }

    }
}