package com.gmail.nguyenkimngan190920.excersise2_buoi5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class BankAdapter(val context: Context, val bankSource:List<BankInfo>)
    : BaseAdapter() {
    override fun getView(established: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = LayoutInflater.from(context).inflate(
                R.layout.row_item_bank,parent,false
        )
        rowView.findViewById<TextView>(R.id.nameTV).text = bankSource[established].name
        rowView.findViewById<TextView>(R.id.establishedTV).text = bankSource[established].established.toString()
        rowView.findViewById<ImageView>(R.id.logoIV).setImageResource(
                bankSource[established].logo
        )
        return rowView
    }

    override fun getItem(established: Int): Any {
        return bankSource[established]
    }

    override fun getItemId(established: Int): Long {
        return established.toLong()
    }

    override fun getCount(): Int {
        return bankSource.count()
    }

}