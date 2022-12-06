package com.example.secondtestkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText
    private lateinit var buttonSave: Button
    private lateinit var textViewName: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSave.setOnClickListener {
            val name = editTextName.text.toString().trim()
            textViewName.text = "${name} ПРИВЕТ)"
        }

    }
}