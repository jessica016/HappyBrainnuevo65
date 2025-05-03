package com.jessica.happybrain

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class InfoEnojadoActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_enojado)

        val txtInfo = findViewById<TextView>(R.id.txtInfoEnojado)
        txtInfo.text = """
            El enojo es una emoción poderosa que surge cuando sentimos que algo es injusto o nos afecta negativamente. 
            Canalizarlo de forma saludable puede ayudarte a concentrarte y expresarte sin dañar. 
            Tómate un momento para respirar, entender lo que sientes y luego actúa con claridad. 🔥💛
        """.trimIndent()

        val btnContinuar = findViewById<Button>(R.id.btnContinuar)
        btnContinuar.setOnClickListener {
            val intent = Intent(this, SeleccionMateriaActivity::class.java)
            startActivity(intent)
        }

    }
}
