package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class Recycle_adapter(val Recyclelist: ArrayList<Recycle>) : RecyclerView.Adapter<Recycle_adapter.Custom_view_holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Recycle_adapter.Custom_view_holder {
        val view_list = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return Custom_view_holder(view_list).apply{
            itemView.setOnClickListener {
                val curPos: Int = adapterPosition
                val go_explanation_signal: Recycle = Recyclelist.get(curPos)
                
            }

        }


    }

    override fun onBindViewHolder(holder: Recycle_adapter.Custom_view_holder, position: Int) {
        holder.post_profile_image_for_adapter.setImageResource(Recyclelist.get(position).post_profile)
        holder.post_name_for_adapter.text=Recyclelist.get(position).post_name
        holder.post_generation_for_adapter.text=Recyclelist.get(position).post_generation
        holder.post_tag_for_adapter.text=Recyclelist.get(position).post_tag
        holder.post_title_for_adapter.text=Recyclelist.get(position).post_title
    }

    override fun getItemCount(): Int {
        return Recyclelist.size
    }

    class Custom_view_holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val post_profile_image_for_adapter = itemView.findViewById<ImageView>(R.id.list_profile_image)
        val post_name_for_adapter = itemView.findViewById<TextView>(R.id.list_name)
        val post_generation_for_adapter = itemView.findViewById<TextView>(R.id.list_generation_number)
        val post_tag_for_adapter = itemView.findViewById<TextView>(R.id.list_tag)
        val post_title_for_adapter = itemView.findViewById<TextView>(R.id.list_title)

    }

}