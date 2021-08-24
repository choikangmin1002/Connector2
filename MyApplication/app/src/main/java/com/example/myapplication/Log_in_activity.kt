package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast

class Log_in_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)



        val log_in_for_log_in_signal : Button = findViewById(R.id.log_in_for_log_in_button)
        val sign_up_for_log_in_signal : Button = findViewById(R.id.go_sign_up_for_log_in_button)
        val remember_id_for_log_in_signal : Switch = findViewById(R.id.remember_id_for_log_in_switch)
        val go_finding_for_log_in_signal : Button = findViewById(R.id.go_finding_for_log_in_button)


        log_in_for_log_in_signal.setOnClickListener {
            Toast.makeText(this@Log_in_activity, "로그인 되었습니다. ", Toast.LENGTH_LONG).show()
            val go_post_list = Intent(this, Home_activity::class.java)
            startActivity(go_post_list)
        }

        remember_id_for_log_in_signal.setOnCheckedChangeListener{ remember_, yes->
            if(yes){
                Toast.makeText(this@Log_in_activity, "ID 기억", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this@Log_in_activity, "ID 기억 안 함", Toast.LENGTH_SHORT).show()
            }
        }

        sign_up_for_log_in_signal.setOnClickListener {
            val go_sign_up = Intent(this, Sign_up_activity::class.java)
            startActivity(go_sign_up)
        }
        go_finding_for_log_in_signal.setOnClickListener {
            val go_finding = Intent(this, Finding_activity::class.java)
            startActivity(go_finding)
        }
    }
}