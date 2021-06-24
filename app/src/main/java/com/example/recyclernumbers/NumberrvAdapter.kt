package com.example.recyclernumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumberrvAdapter (var NumberList:MutableList<BigInteger>): RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.name_list_item,parent,false)
        return NumbersViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumber.text=NumberList.get(position).toString()
    }


        override fun getItemCount(): Int {
            return NumberList.size
        }

    }

    class NumbersViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)

    }
