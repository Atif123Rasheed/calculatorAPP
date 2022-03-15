package com.example.mycalculator

import android.hardware.biometrics.BiometricManager
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RemoteViews
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView

class CalculatorAdapter(val list_items: ArrayList<BiometricManager.Strings>) :RecyclerView.Adapter<CalculatorAdapter.ViewHolder> () {




    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): CalculatorAdapter.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.calculator_buttons, parent, false)
        return ViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onBindViewHolder(holder: CalculatorAdapter.ViewHolder, position: Int) {
        holder.txtTitle.text = list_items[position].toString()
    }

    override fun getItemCount(): Int {
        return list_items.size

    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {
        var txtTitle =  itemView.findViewById<TextView>(R.id.txtTilte)
        //var txtDiscription =  itemView.findViewById<TextView>(R.id.txtDiscription)


    }

}