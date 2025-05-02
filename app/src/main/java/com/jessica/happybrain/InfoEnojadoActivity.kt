package com.jessica.happybrain

import android.annotation.SuppressLint
import android.os.Bundle
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
    }
}
