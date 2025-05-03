package com.jessica.happybrain

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class SeleccionMateriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_materia)

        val btnEspanol = findViewById<Button>(R.id.btnEspanol)
        val btnMatematicas = findViewById<Button>(R.id.btnMatematicas)
        val btnHistoria = findViewById<Button>(R.id.btnHistoria)
        val btnCuriosidades = findViewById<Button>(R.id.btnCuriosidades)

        btnEspanol.setOnClickListener {
            val intent = Intent(this, NivelEspanolActivity::class.java)
            startActivity(intent)
        }

        btnMatematicas.setOnClickListener {
            val intent = Intent(this, NivelMatematicasActivity::class.java)
            startActivity(intent)
        }

        btnHistoria.setOnClickListener {
            val intent = Intent(this, NivelHistoriaActivity::class.java)
            startActivity(intent)
        }

        btnCuriosidades.setOnClickListener {
            val intent = Intent(this, NivelCuriosidadesActivity::class.java)
            startActivity(intent)
        }

    }
}
