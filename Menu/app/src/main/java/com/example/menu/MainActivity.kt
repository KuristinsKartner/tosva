package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnform = findViewById<Button>(R.id.btn_anc)
        val btnhistory = findViewById<Button>(R.id.btn_his)
        val btnsup = findViewById<Button>(R.id.btn_sup)
        val btnother = findViewById<Button>(R.id.btn_ach)
        val btnfb = findViewById<Button>(R.id.btn_fbend)
        val btnach = findViewById<Button>(R.id.btn_other)
        val btnabout = findViewById<Button>(R.id.btn_about)


        btnform.setOnClickListener {
            val intent = Intent(this,Form::class.java)
            startActivity(intent)
            finish()
        }
        btnhistory.setOnClickListener {
            val intent = Intent(this,History::class.java)
            startActivity(intent)
            finish()
        }
        btnsup.setOnClickListener {
            val intent = Intent(this,Support::class.java)
            startActivity(intent)
            finish()
        }
        btnother.setOnClickListener {
            val intent = Intent(this,Other::class.java)
            startActivity(intent)
            finish()
        }
        btnfb.setOnClickListener {
            val intent = Intent(this,Feedback::class.java)
            startActivity(intent)
            finish()
        }
        btnach.setOnClickListener {
            val intent = Intent(this,Achievements::class.java)
            startActivity(intent)
            finish()
        }
        btnabout.setOnClickListener {
            val intent = Intent(this,About::class.java)
            startActivity(intent)
            finish()
        }
    }


}