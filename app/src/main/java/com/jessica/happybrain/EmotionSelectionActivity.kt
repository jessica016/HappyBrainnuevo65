package com.jessica.happybrain

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class EmotionSelectionActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion_selection)

        val btnFeliz = findViewById<Button>(R.id.btnFeliz)
        val btnTriste = findViewById<Button>(R.id.btnTriste)
        val btnEnojado = findViewById<Button>(R.id.btnEnojado)

        btnFeliz.setOnClickListener {
            startActivity(Intent(this, EmocionFelizActivity::class.java))
        }

        btnTriste.setOnClickListener {
            startActivity(Intent(this, EmocionTristeActivity::class.java))
        }

        btnEnojado.setOnClickListener {
            startActivity(Intent(this, EmocionEnojadoActivity::class.java))
        }
    }
}

