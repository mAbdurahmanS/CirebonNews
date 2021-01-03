package com.example.cirebonnews

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv.view.*

class MyAdapter (val arrayList: ArrayList<Model>, val context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(model: Model){

            itemView.tv_title.text = model.title
            itemView.tv_kategori.text = model.kategori
            itemView.tv_time.text = model.time
            itemView.img_view.setImageResource(model.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener{

            val model = arrayList.get(position)

            var gTitle : String = model.title
            var gKategori : String = model.kategori
            var gTime : String = model.time
            var gImg : Int = model.image

            val intent = Intent(context, BeritaIntent::class.java)

            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iKategori", gKategori)
            intent.putExtra("iTime", gTime)
            intent.putExtra("iImg", gImg)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}