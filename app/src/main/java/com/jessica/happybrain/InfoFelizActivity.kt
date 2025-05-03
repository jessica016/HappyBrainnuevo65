package com.jessica.happybrain

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class InfoFelizActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_feliz)

        val txtInfo = findViewById<TextView>(R.id.txtInfoFeliz)
        txtInfo.text = """
            La felicidad es una emoción positiva que nos impulsa a aprender mejor, 
            conectar con otros y disfrutar el momento presente. 
            Cuando estás feliz, tu cerebro está más receptivo a nueva información 
            y tu motivación aumenta. 🧠✨
        """.trimIndent()

        val btnContinuar = findViewById<Button>(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val intent = Intent(this, SeleccionMateriaActivity::class.java)
            startActivity(intent)
        }

    }
}

