package com.jessica.happybrain

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class FraseFelizActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frase_feliz)

        val txtFrase = findViewById<TextView>(R.id.txtFraseFeliz)
        txtFrase.text = "Sigue brillando, tu felicidad ilumina a los demás. 🌟"
    }
}

