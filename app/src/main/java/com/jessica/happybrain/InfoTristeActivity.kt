package com.jessica.happybrain

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class InfoTristeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_triste)

        val txtInfo = findViewById<TextView>(R.id.txtInfoTriste)
        txtInfo.text = """
            La tristeza es una emoción natural que nos invita a reflexionar y cuidarnos. 
            Aunque puede parecer difícil, reconocer y aceptar esta emoción es clave para sanar. 
            Incluso cuando estás triste, aprender puede ayudarte a reencontrarte contigo mismo. 💙
        """.trimIndent()

        val btnContinuar = findViewById<Button>(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val intent = Intent(this, SeleccionMateriaActivity::class.java)
            startActivity(intent)
        }

    }
}

