package com.example.ejercicio9resumen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clase = intent.getStringExtra("imagenC")

        if (clase == "guerrero"){
            findViewById<ImageView>(R.id.imagenClase).setImageResource(R.drawable.guerrero)
        } else if (clase == "ladron"){
            findViewById<ImageView>(R.id.imagenClase).setImageResource(R.drawable.ladron)
        } else if (clase == "mago"){
            findViewById<ImageView>(R.id.imagenClase).setImageResource(R.drawable.mago)
        } else if (clase == "berserker"){
            findViewById<ImageView>(R.id.imagenClase).setImageResource(R.drawable.berserker)
        }

        var raza = intent.getStringExtra("imagenR")

        if (raza == "elfo"){
            findViewById<ImageView>(R.id.imagenRaza).setImageResource(R.drawable.elfo)
        } else if (raza == "humano"){
            findViewById<ImageView>(R.id.imagenRaza).setImageResource(R.drawable.humano)
        } else if (raza == "enano"){
            findViewById<ImageView>(R.id.imagenRaza).setImageResource(R.drawable.enano)
        } else if (raza == "goblin"){
            findViewById<ImageView>(R.id.imagenRaza).setImageResource(R.drawable.goblin)
        }

        var aleatorioFuerza = (10..15).random()

        findViewById<TextView>(R.id.fuerza).apply {
            text = aleatorioFuerza.toString()
        }

        var aleatorioDefensa = (1..5).random()

        findViewById<TextView>(R.id.defensa).apply {
            text = aleatorioDefensa.toString()
        }

        var tamMochila = 100

        findViewById<TextView>(R.id.mochila).apply {
            text = tamMochila.toString()
        }

        var vida = 100

        findViewById<TextView>(R.id.vida).apply {
            text = vida.toString()
        }

        var monedero = 0

        findViewById<TextView>(R.id.monedero).apply {
            text = monedero.toString()
        }

        findViewById<Button>(R.id.botonVolver).setOnClickListener{
            val intento1 = Intent(this,ActividadClases::class.java)
            startActivity(intento1)
        }

        findViewById<Button>(R.id.botonComenzar).setOnClickListener{
            val intento2 = Intent(this,ActivityVacia::class.java)
            startActivity(intento2)
        }
    }
}