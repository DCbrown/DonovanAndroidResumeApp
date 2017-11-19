package com.donovan_brown.donovanresumeapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        var txtMessageBox = findViewById<EditText>(R.id.txtMessage)
        var sendMessageBtn = findViewById<Button>(R.id.sendMessageBtn)
        var backbtn = findViewById<Button>(R.id.goBackButton)
        var moveToHome = Intent(getApplicationContext(),MainActivity::class.java)


        sendMessageBtn.setOnClickListener {
            // read value from EditText to a String variable
            var sendText = txtMessageBox.text.toString()

            //check if the EditText have values or not
            if(sendText.trim().length>0) {
                var emailIntent = Intent(Intent.ACTION_SEND)
                emailIntent.putExtra(Intent.EXTRA_EMAIL,"browncdonovan@gmail.com")
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Contact From DonovanResumeApp")
                emailIntent.putExtra(Intent.EXTRA_TEXT,sendText)
                Toast.makeText(applicationContext, "E-mail was sent to Donovan successfully!", Toast.LENGTH_SHORT).show()
                startActivity(moveToHome)
            }else{
                Toast.makeText(applicationContext, "Please enter a message!", Toast.LENGTH_SHORT).show()
            }
        }

        backbtn.setOnClickListener {
            startActivity(moveToHome)
        }

    }
}
