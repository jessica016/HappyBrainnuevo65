package com.jessica.happybrain
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class FraseTristeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frase_triste)

        val txtFrase = findViewById<TextView>(R.id.txtFraseTriste)
        txtFrase.text = "Está bien no estar bien. Tómate tu tiempo, tu luz volverá a brillar. 🌈"
    }
}

