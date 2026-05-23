package com.example.draftprojek

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val cardHardware = findViewById<LinearLayout>(R.id.cardHardware)
        val cardQuiz = findViewById<LinearLayout>(R.id.cardQuiz)

        cardHardware.setOnClickListener {
            startActivity(Intent(this, MateriActivity::class.java))
        }

        cardQuiz.setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java))
        }
    }
}