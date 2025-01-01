package com.example.cryptomvvm.Activity

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.cryptomvvm.Models.CryptoModel
import com.example.cryptomvvm.R
import com.example.cryptomvvm.databinding.ActivityDetailBinding
import java.util.ResourceBundle.getBundle

class DetailActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDetailBinding
    private  lateinit var item:CryptoModel
    private  var formatter:DecimalFormat= DecimalFormat("###,###,###.##")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getBundle()
        serVariable()
        orderType()
    }

    private fun orderType() {
        val adapter = ArrayAdapter(
            this,
            R.layout.spinner_item,
            listOf("Limit Order", "Market Order", "Stop Order")
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.orderPositionBtn.adapter = adapter
    }

    private fun serVariable() {
        binding.buyPositionBtn.setOnClickListener {
            binding.apply {
                buyPositionBtn.setBackgroundResource(R.drawable.green_bg)
                sellPositionBtn.setBackgroundResource(R.drawable.semi_black_bg)
                sendOrderBtn.setBackgroundResource(R.drawable.green_bg)
                sendOrderBtn.text="Buy "+item.shortSymbol.replace("/USDT","")
            }
        }

        binding.sellPositionBtn.setOnClickListener {
            binding.apply {
                buyPositionBtn.setBackgroundResource(R.drawable.semi_black_bg)
                sellPositionBtn.setBackgroundResource(R.drawable.red_bg)
                sendOrderBtn.setBackgroundResource(R.drawable.red_bg)
                sendOrderBtn.text="Sell "+item.shortSymbol.replace("/USDT","")
            }
        }

        binding.plusAmountBtn.setOnClickListener {
            if(binding.amountEdt.text.isEmpty()){
                binding.amountEdt.setText("0")
            }
            var n:Double = binding.amountEdt.text.toString().toDouble()
            n += 1
            binding.amountEdt.setText(n.toString())
        }

        binding.minusAmountBtn.setOnClickListener {
            if(binding.amountEdt.text.isEmpty()){
                binding.amountEdt.setText("0")
            }
            var n:Double = binding.amountEdt.text.toString().toDouble()
            if (n>0){
                n -= 1
                binding.amountEdt.setText(n.toString())
            }
        }

    }

    private fun getBundle() {
        item = intent.getSerializableExtra("object") as CryptoModel

        binding.symbolNameTxt.text = item.shortSymbol
        binding.priceTxt.text = item.price.toString()
        binding.changePerentageTxt.text = item.changePercent.toString()+"$"
        binding.pSellTxt1.text = formatter.format(item.sellPrice1)?:"0"
        binding.pSellTxt2.text = formatter.format(item.sellPrice2)?:"0"
        binding.pSellTxt3.text = formatter.format(item.sellPrice3)?:"0"
        binding.pSellTxt4.text = formatter.format(item.sellPrice4)?:"0"
        binding.pSellTxt5.text = formatter.format(item.sellPrice5)?:"0"

        binding.aSellTxt1.text = item.sellAmount1.toString()
        binding.aSellTxt2.text = item.sellAmount2.toString()
        binding.aSellTxt3.text = item.sellAmount3.toString()
        binding.aSellTxt4.text = item.sellAmount4.toString()
        binding.aSellTxt5.text = item.sellAmount5.toString()

        binding.pBuyTxt1.text = formatter.format(item.buyPrice1)?:"0"
        binding.pBuyTxt2.text = formatter.format(item.buyPrice2)?:"0"
        binding.pBuyTxt3.text = formatter.format(item.buyPrice3)?:"0"
        binding.pBuyTxt4.text = formatter.format(item.buyPrice4)?:"0"
        binding.pBuyTxt5.text = formatter.format(item.buyPrice5)?:"0"

        binding.aBuyTxt1.text = item.buyAmount1.toString()
        binding.aBuyTxt2.text = item.buyAmount2.toString()
        binding.aBuyTxt3.text = item.buyAmount3.toString()
        binding.aBuyTxt4.text = item.buyAmount4.toString()
        binding.aBuyTxt5.text = item.buyAmount5.toString()

        binding.openTxt.text = formatter.format(item.open)?:"0"
        binding.closeTxt.text = formatter.format(item.close)?:"0"
        binding.highTxt.text = formatter.format(item.high)?:"0"
        binding.lowTxt.text = formatter.format(item.low)?:"0"
        binding.changeTxt.text = item.dailyChange.toString()+"%"
        binding.volumeTxt.text = "$"+item.dailyVol.toString()+"T"

        if(item.changePercent>0){
            binding.priceTxt.setTextColor(resources.getColor(R.color.green))
            binding.changePerentageTxt.setTextColor(resources.getColor(R.color.green))
        } else{
            binding.priceTxt.setTextColor(resources.getColor(R.color.red))
            binding.changePerentageTxt.setTextColor(resources.getColor(R.color.red))
        }

        val drawable = resources.getIdentifier(item.symbolLogo, "drawable", packageName)
        Glide.with(this)
            .load(drawable)
            .into(binding.logoImg)

        binding.backBtn.setOnClickListener {
            finish()
        }

    }
}