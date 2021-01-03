package com.example.cirebonnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("The NextDev Summit 2020 Virtual Talk Live On Youtube","Developer","01:00-03:00 PM",R.drawable.laptop))
        arrayList.add(Model("Cara menghadapi Perkembangan Zaman yang sangat pesat ini","Social Media","09:00-11:00 AM",R.drawable.social))
        arrayList.add(Model("Salah satu Motor Harley yang akan meluncur tahun ini","Otomotif","08:30-10:00 PM",R.drawable.bycyle))

        val myAdapter = MyAdapter(arrayList, this)

        rv_home.layoutManager = LinearLayoutManager(this)
        rv_home.adapter = myAdapter
    }
}