package com.donovan_brown.donovanresumeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var exp = findViewById<Button>(R.id.expButton)
        var skills = findViewById<Button>(R.id.skillsButton)
        var email = findViewById<Button>(R.id.emailButton)

        exp.setOnClickListener {

            var moveToExp = Intent(getApplicationContext(),ExperienceActivity::class.java)
            startActivity(moveToExp)

        }

        skills.setOnClickListener {

            var moveToSkills = Intent(getApplicationContext(), SkillsActivity::class.java)
            startActivity(moveToSkills)
        }

        email.setOnClickListener {

            var moveToEmail = Intent(getApplicationContext(), ContactActivity::class.java)
            startActivity(moveToEmail)
        }

    }
}
