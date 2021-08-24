package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val go_login_for_main_signal : Button = findViewById(R.id.go_log_in_for_main_button)
        val go_sign_up_for_main_signal : Button = findViewById(R.id.go_sign_up_for_main_button)
        val go_navigation_menu_for_main_signal : FloatingActionButton = findViewById(R.id.go_navigation_menu_for_main_button)


        go_navigation_menu_for_main_signal.setOnClickListener{
            layout_drawer.openDrawer(GravityCompat.START)
        }
        navi_view.setNavigationItemSelectedListener(this)
        go_login_for_main_signal.setOnClickListener {
            val go_login_main = Intent(this, Log_in_activity::class.java)
            startActivity(go_login_main)
        }
        go_sign_up_for_main_signal.setOnClickListener {
            val go_sign_up_main = Intent(this, Sign_up_activity::class.java)
            startActivity(go_sign_up_main)
            finish()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.navi_account_title -> Toast.makeText(applicationContext, "로그인 후 이용해주세요. ", Toast.LENGTH_SHORT).show()
            R.id.navi_find_project_title -> Toast.makeText(applicationContext, "로그인 후 이용해주세요. ", Toast.LENGTH_SHORT).show()
            R.id.navi_write_title -> Toast.makeText(applicationContext, "로그인 후 이용해주세요. ", Toast.LENGTH_SHORT).show()
            R.id.navi_project_title -> Toast.makeText(applicationContext, "로그인 후 이용해주세요. ", Toast.LENGTH_SHORT).show()
            R.id.navi_chart_title -> Toast.makeText(applicationContext, "로그인 후 이용해주세요. ", Toast.LENGTH_SHORT).show()

        }
    layout_drawer.closeDrawers()
    return false
    }
}