package com.example.a3mode_baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UtamaActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utama)
        button = findViewById(R.id.stand)
        button = findViewById(R.id.scien)
        button.setOnClickListener {
            startActivity(Intent(this, StandartActivity::class.java))
        }
        button.setOnClickListener {
            startActivity(Intent(this, ScientificActivity::class.java))
        }
    }

}
