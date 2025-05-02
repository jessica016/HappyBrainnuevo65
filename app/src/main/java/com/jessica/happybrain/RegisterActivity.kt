package com.jessica.happybrain

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.happybrain.R

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val edtNombre = findViewById<EditText>(R.id.edtNombre)
        val edtCorreo = findViewById<EditText>(R.id.edtCorreo)
        val edtEdad = findViewById<EditText>(R.id.edtEdad)
        val edtTelefono = findViewById<EditText>(R.id.edtTelefono)
        val edtContrasena = findViewById<EditText>(R.id.edtContrasena)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        btnRegistrar.setOnClickListener {
            val nombre = edtNombre.text.toString()
            val correo = edtCorreo.text.toString()
            val edad = edtEdad.text.toString()
            val telefono = edtTelefono.text.toString()
            val contrasena = edtContrasena.text.toString()

            if (nombre.isNotEmpty() && correo.isNotEmpty() && edad.isNotEmpty()
                && telefono.isNotEmpty() && contrasena.isNotEmpty()) {

                // Aquí puedes guardar en base de datos más adelante
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

