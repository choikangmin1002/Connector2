package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_finding.*

class Finding_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding)
        val go_finding_email_for_finding_signal : Button = findViewById(R.id.go_finding_email_for_finding_button)


        go_finding_email_for_finding_signal.setOnClickListener {
            val go_finding_email_for_finding = Intent(this, Finding_email_activity::class.java)
           //val email_address_text = email_for_finding_scan.text.toString()
            intent.putExtra("email_address", email_for_finding_scan.text.toString())
            startActivity(go_finding_email_for_finding)
        }
    }
}