package com.jessica.happybrain

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class EmocionTristeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emocion_triste)

        val btnVideo = findViewById<Button>(R.id.btnVideoTriste)
        val btnFrase = findViewById<Button>(R.id.btnFraseTriste)
        val btnInfo = findViewById<Button>(R.id.btnInfoTriste)

        btnVideo.setOnClickListener {
            startActivity(Intent(this, VideoTristeActivity::class.java))
        }

        btnFrase.setOnClickListener {
            startActivity(Intent(this, FraseTristeActivity::class.java))
        }

        btnInfo.setOnClickListener {
            startActivity(Intent(this, InfoTristeActivity::class.java))
        }
    }
}

