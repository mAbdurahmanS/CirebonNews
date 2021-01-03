package com.example.cirebonnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_berita_intent.*

class BeritaIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita_intent)

        var intent = intent
        val aTitle = intent.getStringExtra("iTitle")
        val aKategori = intent.getStringExtra("iKategori")
        val aTime = intent.getStringExtra("iTime")
        val aImg = intent.getIntExtra("iImg", 0)

        tv_title.text = aTitle
        tv_kategori.text = aKategori
        tv_time.text = aTime
        img_view.setImageResource(aImg)
    }
}