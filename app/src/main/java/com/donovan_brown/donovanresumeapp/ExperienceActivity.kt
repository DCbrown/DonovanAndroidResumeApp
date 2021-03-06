package com.donovan_brown.donovanresumeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExperienceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experience)

        var backbtn = findViewById<Button>(R.id.goBackButton)

        backbtn.setOnClickListener {
            var moveToHome = Intent(getApplicationContext(),MainActivity::class.java)
                startActivity(moveToHome)
        }
    }
}
