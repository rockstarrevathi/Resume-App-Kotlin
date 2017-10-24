package com.example.android.resumeapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workHistory = findViewById<Button>(R.id.workHistoryButton)
        workHistory.setOnClickListener {
            println("Hey you pressed work exp button")

            var moveToWorkHistory = Intent(getApplicationContext(),WorkHistoryActivity::class.java)
            startActivity(moveToWorkHistory)
        }
        val callButton = findViewById<Button>(R.id.callButton)
        callButton.setOnClickListener {

            var phoneUri = Uri.parse("tel:14057620000")
            var callIntent = Intent(Intent.ACTION_DIAL,phoneUri)
            startActivity(callIntent)
        }

    val emailButton = findViewById<Button>(R.id.emailButton)
        emailButton.setOnClickListener {


        var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("Plain/Text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL,"hire.revathi@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Nice Resume")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"I really loved your resume")
            startActivity(emailIntent)
        }
    }
}