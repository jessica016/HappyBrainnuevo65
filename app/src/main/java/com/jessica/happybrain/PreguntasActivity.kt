package com.jessica.happybrain

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class PreguntasActivity : AppCompatActivity() {

    private lateinit var txtPregunta: TextView
    private lateinit var btnOpcion1: Button
    private lateinit var btnOpcion2: Button
    private lateinit var btnOpcion3: Button
    private lateinit var btnSiguiente: Button

    private var indicePregunta = 0
    private var preguntas: List<Pregunta> = emptyList()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntas)

        txtPregunta = findViewById(R.id.txtPregunta)
        btnOpcion1 = findViewById(R.id.btnOpcion1)
        btnOpcion2 = findViewById(R.id.btnOpcion2)
        btnOpcion3 = findViewById(R.id.btnOpcion3)
        btnSiguiente = findViewById(R.id.btnSiguiente)

        val materia = intent.getStringExtra("materia")
        val nivel = intent.getStringExtra("nivel")

        preguntas = obtenerPreguntas(materia, nivel)

        mostrarPregunta()

        btnSiguiente.setOnClickListener {
            if (indicePregunta < preguntas.size - 1) {
                indicePregunta++
                mostrarPregunta()
            } else {
                Toast.makeText(this, "¡Has terminado el nivel!", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }

    private fun mostrarPregunta() {
        val preguntaActual = preguntas[indicePregunta]
        txtPregunta.text = preguntaActual.texto
        btnOpcion1.text = preguntaActual.opciones[0]
        btnOpcion2.text = preguntaActual.opciones[1]
        btnOpcion3.text = preguntaActual.opciones[2]
    }

    private fun obtenerPreguntas(materia: String?, nivel: String?): List<Pregunta> {
        return when (materia) {
            "español" -> when (nivel) {
                "basico" -> PreguntasData.espanolBasico
                "medio" -> PreguntasData.espanolMedio
                "avanzado" -> PreguntasData.espanolAvanzado
                else -> emptyList()
            }
            "matematicas" -> when (nivel) {
                "basico" -> PreguntasData.matematicasBasico
                "medio" -> PreguntasData.matematicasMedio
                "avanzado" -> PreguntasData.matematicasAvanzado
                else -> emptyList()
            }
            "historia" -> when (nivel) {
                "basico" -> PreguntasData.historiaBasico
                "medio" -> PreguntasData.historiaMedio
                "avanzado" -> PreguntasData.historiaAvanzado
                else -> emptyList()
            }
            "curiosidades" -> when (nivel) {
                "basico" -> PreguntasData.curiosidadesBasico
                "medio" -> PreguntasData.curiosidadesMedio
                "avanzado" -> PreguntasData.curiosidadesAvanzado
                else -> emptyList()
            }
            else -> emptyList()
        }
    }
}
