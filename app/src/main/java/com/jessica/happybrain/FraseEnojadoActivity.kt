package com.jessica.happybrain

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class FraseEnojadoActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frase_enojado)

        val txtFrase = findViewById<TextView>(R.id.txtFraseEnojado)
        txtFrase.text = "Respira profundo. La calma no está lejos, está dentro de ti. 🧘‍♂️"

        val btnContinuar = findViewById<Button>(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val intent = Intent(this, SeleccionMateriaActivity::class.java)
            startActivity(intent)
        }

    }
}

