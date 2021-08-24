package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast

class Sign_up_activity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val not_robot_for_sign_up_signal: RadioButton =
            findViewById(R.id.not_robot_for_sign_up_check)
        val create_an_account_for_sign_up_signal: Button =
            findViewById(R.id.create_an_account_for_sign_up_button)
        not_robot_for_sign_up_signal.setOnCheckedChangeListener { buttonView, not_robot_sign_up ->
            create_an_account_for_sign_up_signal.setOnClickListener {
                if (not_robot_sign_up) {
                    Toast.makeText(
                        this@Sign_up_activity,
                        "정상적으로 회원가입되었습니다. ",
                        Toast.LENGTH_SHORT
                    ).show()
                    val go_sign_up_success_for_sign_up_signal = Intent(this, Sign_up_success_activity::class.java)
                    startActivity(go_sign_up_success_for_sign_up_signal)
                    finish()
                }
            }
        }
    }
}
