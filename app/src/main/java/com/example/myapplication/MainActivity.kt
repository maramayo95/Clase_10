package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Ejercicio Prueba
        val texto  = findViewById<TextView>(R.id.texto)
        texto.setText("Hola ")

        // Ejercicio 1
        val ejercicioUno = findViewById<TextView>(R.id.ejercicioUno)
        val nombre ="Matias"
        val apellido = "Aramayo"
        ejercicioUno.setText("Mi nombre y apellido es: $nombre $apellido")


        // Ejercicio 2
        val ejercicioDos = findViewById<TextView>(R.id.ejercicioDos)
        val btnEjercicioDos = findViewById<Button>(R.id.btn_ejercicioDos)


        btnEjercicioDos.setOnClickListener(){
            val nombre = "Carlos"
            val apellido = "Tevez"
            ejercicioDos.setText("Mi nombre es $nombre $apellido")
        }

        // Ejercicio 3
            val diasRestantes = findViewById<TextView>(R.id.daysYear)
            val pizza = findViewById<TextView>(R.id.pizza)
            val btnEjercicioTres = findViewById<Button>(R.id.btn_ejercicioTres)
            val porcionesPizza = findViewById<TextView>(R.id.porcionesPizza)

            btnEjercicioTres.setOnClickListener(){
                val dias = diasRestantes.text.toString().toInt()
                val cantidadPorciones = pizza.text.toString().toInt()
                val porcionesPorComer = (dias/7) * cantidadPorciones
                porcionesPizza.setText(" Quedan $porcionesPorComer porciones ")

            }

    }

}



