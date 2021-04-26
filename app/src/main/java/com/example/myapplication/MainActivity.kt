package com.example.myapplication

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            textView.text = "Здесь меняется текст!"
        }
    }
}