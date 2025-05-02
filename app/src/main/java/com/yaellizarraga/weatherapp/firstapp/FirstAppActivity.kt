package com.yaellizarraga.weatherapp.firstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yaellizarraga.weatherapp.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Initial code on launch app
        val btnHello = findViewById<Button>(R.id.btnHello)
        val txtHello = findViewById<EditText>(R.id.txtTexto)

        btnHello.setOnClickListener {
            val text = txtHello.text.toString()
            if (text.isNotEmpty()) {
                val resultView = Intent(this, ResultActivity::class.java)
                resultView.putExtra("myText", text)
                startActivity(resultView)
            }
        }
    }
}