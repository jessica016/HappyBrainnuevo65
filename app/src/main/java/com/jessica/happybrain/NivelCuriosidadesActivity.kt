package com.jessica.happybrain

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class NivelCuriosidadesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel_curiosidades)

        val btnBasico = findViewById<Button>(R.id.btnBasico)
        val btnMedio = findViewById<Button>(R.id.btnMedio)
        val btnAvanzado = findViewById<Button>(R.id.btnAvanzado)

        btnBasico.setOnClickListener {
            irAPreguntas("curiosidades", "basico")
        }

        btnMedio.setOnClickListener {
            irAPreguntas("curiosidades", "medio")
        }

        btnAvanzado.setOnClickListener {
            irAPreguntas("curiosidades", "avanzado")
        }
    }

    private fun irAPreguntas(materia: String, nivel: String) {
        val intent = Intent(this, PreguntasActivity::class.java)
        intent.putExtra("materia", materia)
        intent.putExtra("nivel", nivel)
        startActivity(intent)
    }
}

