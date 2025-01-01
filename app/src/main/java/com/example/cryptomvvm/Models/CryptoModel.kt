package com.example.cryptomvvm.Models

import java.io.Serializable

data class CryptoModel(

    val symbol:String="",
    val shortSymbol:String="",
    val price:Double,
    val changePercent:Double,
    val amountNumber:Double,
    val amountDollar:Double,
    val sellPrice1:Double,
    val sellPrice2:Double,
    val sellPrice3:Double,
    val sellPrice4:Double,
    val sellPrice5:Double,
    val sellAmount1:Double,
    val sellAmount2:Double,
    val sellAmount3:Double,
    val sellAmount4:Double,
    val sellAmount5:Double,
    val buyPrice1:Double,
    val buyPrice2:Double,
    val buyPrice3:Double,
    val buyPrice4:Double,
    val buyPrice5:Double,
    val buyAmount1:Double,
    val buyAmount2:Double,
    val buyAmount3:Double,
    val buyAmount4:Double,
    val buyAmount5:Double,
    val open:Double,
    val close:Double,
    val high:Double,
    val low:Double,
    val dailyChange:Double,
    val dailyVol:Double,
    val symbolLogo:String=""
):Serializable
