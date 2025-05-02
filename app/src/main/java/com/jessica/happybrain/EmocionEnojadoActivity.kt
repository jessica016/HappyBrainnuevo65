package com.jessica.happybrain

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class EmocionEnojadoActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emocion_enojado)

        val btnVideo = findViewById<Button>(R.id.btnVideoEnojado)
        val btnFrase = findViewById<Button>(R.id.btnFraseEnojado)
        val btnInfo = findViewById<Button>(R.id.btnInfoEnojado)

        btnVideo.setOnClickListener {
            startActivity(Intent(this, VideoEnojadoActivity::class.java))
        }

        btnFrase.setOnClickListener {
            startActivity(Intent(this, FraseEnojadoActivity::class.java))
        }

        btnInfo.setOnClickListener {
            startActivity(Intent(this, InfoEnojadoActivity::class.java))
        }
    }
}

