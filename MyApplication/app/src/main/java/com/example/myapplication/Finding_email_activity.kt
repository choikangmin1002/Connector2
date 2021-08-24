package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_finding_email.*

class Finding_email_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finding_email)

        if(intent.hasExtra("email_address")){
            print_email_for_finding_email_tv.text = intent.getStringExtra("email_address")
        }

        val request_code_for_finding_email_signal : Button = findViewById(R.id.request_code_for_finding_email_button)
        var okay_for_finding_email = 0
        request_code_for_finding_email_signal.setOnClickListener {
            okay_for_finding_email = 1
            val email = Intent(Intent.ACTION_SEND)
            email.type = "plain/text"
            val address = arrayOf("qwersed1002@naver.com")
            email.putExtra(Intent.EXTRA_EMAIL, address)
            email.putExtra(Intent.EXTRA_SUBJECT, "test@test")
            email.putExtra(Intent.EXTRA_TEXT, "내용 미리보기 (미리적을 수 있음)")
            guide_email_for_finding_email_tv.setText("인증번호 5자리를 입력해주세요. ")
            request_guide_email_for_finding_email_tv.setText("이메일이 오지 않았다면 다시 한 번 \n'요청'을 눌러주세요.")
            startActivity(email)


        }
        val go_finding_change_pw_for_finding_email_signal : Button = findViewById(R.id.go_finding_change_pw_for_finding_email_button)
        go_finding_change_pw_for_finding_email_signal.setOnClickListener {
            if(okay_for_finding_email == 1){
                val go_finding_change_pw_for_finding_email = Intent(this, Finding_change_pw_activity::class.java)
                startActivity(go_finding_change_pw_for_finding_email)
            }
        }

    }
}