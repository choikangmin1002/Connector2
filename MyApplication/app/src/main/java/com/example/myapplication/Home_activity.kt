package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class Home_activity : AppCompatActivity() ,NavigationView.OnNavigationItemSelectedListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val go_navigation_menu_for_home_signal : ImageButton = findViewById(R.id.go_navigation_menu_for_home_button)


        go_navigation_menu_for_home_signal.setOnClickListener{
            layout_drawer.openDrawer(GravityCompat.START)
        }
        navi_view.setNavigationItemSelectedListener(this)
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.navi_account_title ->
            {val go_profile = Intent(this, Profile_activity::class.java)
                startActivity(go_profile)}
            R.id.navi_find_project_title ->
            {val go_recycle = Intent(this, Post_list_activity::class.java)
            startActivity(go_recycle)}
            R.id.navi_write_title -> Toast.makeText(applicationContext, "로그인 후 이용해주세요. ", Toast.LENGTH_SHORT).show()
            R.id.navi_project_title -> Toast.makeText(applicationContext, "로그인 후 이용해주세요. ", Toast.LENGTH_SHORT).show()
            R.id.navi_chart_title -> Toast.makeText(applicationContext, "로그인 후 이용해주세요. ", Toast.LENGTH_SHORT).show()
        }
        layout_drawer.closeDrawers()
        return false
    }
}