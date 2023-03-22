package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.android.synthetic.main_

class MainActivity : AppCompatActivity() {
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)

        button.setOnclickListener{ set_text("ok") }
    }
    fun set_text(str: String) {
        costs.append(str)
    }
}