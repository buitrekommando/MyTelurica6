package com.joseluishenriquez.mytelurica6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class PostAdapter(val postModel: MutableList<PostModel> ): RecyclerView.Adapter<PostviewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_post, parent,false)
        return PostviewHolder(view)
    }

    override fun getItemCount(): Int {
        return postModel.size
    }

    override fun onBindViewHolder(holder: PostviewHolder, position: Int) {
        return holder.bindView(postModel[position])
    }
}

class PostviewHolder(itemView: View): RecyclerView.ViewHolder (itemView){
    private val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    private val tvBody: TextView = itemView.findViewById(R.id.tvBody)
    private val tvProfundidad: TextView = itemView.findViewById(R.id.tvProfundidad)
    private val tvRefGeografica:TextView =itemView.findViewById(R.id.tvRefGeografica)
    private val tvFechaUpdate:TextView = itemView.findViewById(R.id.tvFechaUpdate)

    fun bindView(postModel: PostModel){
        tvTitle.text = postModel.Fecha
        tvBody.text = postModel.Magnitud +"º Richter"
        tvProfundidad.text= postModel.Profundidad +" Kilometros"
        tvRefGeografica.text= postModel.RefGeografica
        tvFechaUpdate.text = postModel.FechaUpdate


    }

}