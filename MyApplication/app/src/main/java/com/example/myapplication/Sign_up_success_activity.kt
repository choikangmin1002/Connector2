package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sign_up_success_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_success)
        val go_log_in_for_sign_up_success_signal : Button = findViewById(R.id.go_log_in_for_sign_up_success_button)
        go_log_in_for_sign_up_success_signal.setOnClickListener {
            val go_log_in_for_sign_up_success = Intent(this, Log_in_activity::class.java)
            startActivity(go_log_in_for_sign_up_success)
            finish()
        }
    }
}