package ru.geekbrains.team_2022_04_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //супер-пупер приложение!!!

        // Полезно пользоваться binding

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            Toast.makeText(this, "Message!", Toast.LENGTH_SHORT).show()
        }

    }
}