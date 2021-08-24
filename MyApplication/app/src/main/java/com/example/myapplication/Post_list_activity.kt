package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_post_list.*

class Post_list_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_list)

        val Recyclelist = arrayListOf(
            Recycle(R.drawable.people, "최강민", "-5기", "#안드로와_이들", "미래 장래희망 = 백수"),
            Recycle(R.drawable.man, "조재영", "-5기", "#와_ㅐ영",  "우리 민이...."),
            Recycle(R.drawable.man_2, "조윤겸", "-5기", "#문서작성",  "우리 원신...."),
            Recycle(R.drawable.people, "차주형", "-5기", "#파이<선의>",  "우리 선의...."),
            Recycle(R.drawable.man_2, "강경민", "-5기", "#안드로와_이들",  "우리 뱃살...."),
            Recycle(R.drawable.people, "최강민", "-5기", "#안드로와_이들", "미래 장래희망 = 백수"),
            Recycle(R.drawable.man, "조재영", "-5기", "#와_ㅐ영",  "우리 민이...."),
            Recycle(R.drawable.man_2, "조윤겸", "-5기", "#문서작성",  "우리 원신...."),
            Recycle(R.drawable.people, "차주형", "-5기", "#파이<선의>",  "우리 선의...."),
            Recycle(R.drawable.man_2, "강경민", "-5기", "#안드로와_이들",  "우리 뱃살...."),
            Recycle(R.drawable.people, "최강민", "-5기", "#안드로와_이들", "미래 장래희망 = 백수"),
            Recycle(R.drawable.man, "조재영", "-5기", "#와_ㅐ영",  "우리 민이...."),
            Recycle(R.drawable.man_2, "조윤겸", "-5기", "#문서작성", "우리 원신...."),
            Recycle(R.drawable.people, "차주형", "-5기", "#파이<선의>",  "우리 선의...."),
            Recycle(R.drawable.man_2, "강경민", "-5기", "#안드로와_이들",  "우리 뱃살...."),
            Recycle(R.drawable.people, "최강민", "-5기", "#안드로와_이들", "미래 장래희망 = 백수"),
            Recycle(R.drawable.man, "조재영", "-5기", "#와_ㅐ영",  "우리 민이...."),
            Recycle(R.drawable.man_2, "조윤겸", "-5기", "#문서작성",  "우리 원신...."),
            Recycle(R.drawable.people, "차주형", "-5기", "#파이<선의>",  "우리 선의...."),
            Recycle(R.drawable.man_2, "강경민", "-5기", "#안드로와_이들",  "우리 뱃살...."),
        )
        post_list_recycle.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        post_list_recycle.setHasFixedSize(true)
        post_list_recycle.adapter = Recycle_adapter(Recyclelist)
    }
}