package com.jessica.happybrain

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class EmocionFelizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emocion_feliz)

        val btnVideo = findViewById<Button>(R.id.btnVideoFeliz)
        val btnFrase = findViewById<Button>(R.id.btnFraseFeliz)
        val btnInfo = findViewById<Button>(R.id.btnInfoFeliz)

        btnVideo.setOnClickListener {
            startActivity(Intent(this, VideoFelizActivity::class.java))
        }

        btnFrase.setOnClickListener {
            startActivity(Intent(this, FraseFelizActivity::class.java))
        }

        btnInfo.setOnClickListener {
            startActivity(Intent(this, InfoFelizActivity::class.java))
        }
    }
}

