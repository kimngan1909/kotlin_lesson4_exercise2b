package com.gmail.nguyenkimngan190920.excersise2_buoi5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class BankRVAdapter(val context: Context,val bankSource:List<BankInfo>) : RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_item_bank,
                parent,false))
    }
    override fun getItemCount(): Int {
        return bankSource.count()
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTV.text = bankSource[position].name
        holder.establishedTV.text = bankSource[position].established.toString()
        holder.logoIV.setImageResource(bankSource[position].logo)
    }
}
class ViewHolder(view: View):RecyclerView.ViewHolder(view){
    val logoIV = view.findViewById<ImageView>(R.id.logoIV)
    val nameTV = view.findViewById<TextView>(R.id.nameTV)
    val establishedTV = view.findViewById<TextView>(R.id.establishedTV)
}