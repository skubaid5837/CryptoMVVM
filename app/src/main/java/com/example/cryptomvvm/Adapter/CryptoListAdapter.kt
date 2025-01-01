package com.example.cryptomvvm.Adapter

import android.content.Context
import android.content.Intent
import android.icu.text.DecimalFormat
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cryptomvvm.Activity.DetailActivity
import com.example.cryptomvvm.Models.CryptoModel
import com.example.cryptomvvm.R
import com.example.cryptomvvm.databinding.ViewholderWalletBinding

class CryptoListAdapter(private val item:MutableList<CryptoModel>):RecyclerView.Adapter<CryptoListAdapter.ViewHolder>() {

    class ViewHolder(val binding: ViewholderWalletBinding)
        :RecyclerView.ViewHolder(binding.root)

    private lateinit var context:Context
    var formatter:DecimalFormat?=null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CryptoListAdapter.ViewHolder {
        context=parent.context
            formatter= DecimalFormat("###,###,###,###")
            val binding=ViewholderWalletBinding.inflate(LayoutInflater.from(context)
            ,parent,false)
            return ViewHolder(binding)
        }

    override fun onBindViewHolder(holder: CryptoListAdapter.ViewHolder, position: Int) {

        val item = item[position]
        holder.binding.cryptoName.text = item.symbol
        holder.binding.cryptoPrice.text = "$"+formatter?.format(item.price)
        holder.binding.changePercentTxt.text = item.changePercent.toString()+"%"
        holder.binding.propertySizeTxt.text = item.amountNumber.toString()+item.shortSymbol.replace("/USDT", "")
        holder.binding.propertyAmountTxt.text = "$"+formatter?.format(item.amountDollar)

        if (item.changePercent<0) holder.binding.changePercentTxt.setTextColor(
            context.resources.getColor(R.color.red)
        )

        val drawableResourceId = holder.itemView.resources.getIdentifier(
            item.symbolLogo,
            "drawable",
            holder.itemView.context.packageName
        )

        Glide.with(context)
            .load(drawableResourceId)
            .into(holder.binding.logoImg)

        holder.itemView.setOnClickListener{
            val intent=Intent(context, DetailActivity::class.java)
            intent.putExtra("object", item)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = item.size

}