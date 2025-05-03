package com.jessica.happybrain

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class NivelMatematicasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel_matematicas)

        val btnBasico = findViewById<Button>(R.id.btnBasico)
        val btnMedio = findViewById<Button>(R.id.btnMedio)
        val btnAvanzado = findViewById<Button>(R.id.btnAvanzado)

        btnBasico.setOnClickListener {
            irAPreguntas("matematicas", "basico")
        }

        btnMedio.setOnClickListener {
            irAPreguntas("matematicas", "medio")
        }

        btnAvanzado.setOnClickListener {
            irAPreguntas("matematicas", "avanzado")
        }
    }

    private fun irAPreguntas(materia: String, nivel: String) {
        val intent = Intent(this, PreguntasActivity::class.java)
        intent.putExtra("materia", materia)
        intent.putExtra("nivel", nivel)
        startActivity(intent)
    }
}
