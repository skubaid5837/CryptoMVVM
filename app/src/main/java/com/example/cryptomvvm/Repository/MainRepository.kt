package com.example.cryptomvvm.Repository

import com.example.cryptomvvm.Models.CryptoModel

class MainRepository {

    val items = mutableListOf(
        CryptoModel(
            symbol = "Bitcoin",
            shortSymbol = "BTC/USDT",
            price = 27850.0,
            changePercent = 1.5,
            amountNumber = 0.8,
            amountDollar = 2230000.0,
            sellPrice1 = 27860.0, sellPrice2 = 27870.0, sellPrice3 = 27880.0, sellPrice4 = 27890.0, sellPrice5 = 27900.0,
            sellAmount1 = 1.2, sellAmount2 = 0.9, sellAmount3 = 1.4, sellAmount4 = 1.1, sellAmount5 = 0.7,
            buyPrice1 = 27840.0, buyPrice2 = 27830.0, buyPrice3 = 27820.0, buyPrice4 = 27810.0, buyPrice5 = 27800.0,
            buyAmount1 = 1.3, buyAmount2 = 1.0, buyAmount3 = 1.2, buyAmount4 = 1.1, buyAmount5 = 0.9,
            open = 27600.0, close = 27850.0, high = 27900.0, low = 27550.0,
            dailyChange = 250.0, dailyVol = 850.0,
            symbolLogo = "bitcoin"
        ),
        CryptoModel(
            symbol = "Etherium",
            shortSymbol = "ETH/USDT",
            price = 1845.0,
            changePercent = -0.4,
            amountNumber = 0.6,
            amountDollar = 850000.0,
            sellPrice1 = 1850.0, sellPrice2 = 1855.0, sellPrice3 = 1860.0, sellPrice4 = 1865.0, sellPrice5 = 1870.0,
            sellAmount1 = 2.5, sellAmount2 = 2.0, sellAmount3 = 1.8, sellAmount4 = 2.2, sellAmount5 = 1.6,
            buyPrice1 = 1840.0, buyPrice2 = 1835.0, buyPrice3 = 1830.0, buyPrice4 = 1825.0, buyPrice5 = 1820.0,
            buyAmount1 = 2.1, buyAmount2 = 1.9, buyAmount3 = 2.4, buyAmount4 = 1.7, buyAmount5 = 2.3,
            open = 1850.0, close = 1845.0, high = 1860.0, low = 1835.0,
            dailyChange = -5.0, dailyVol = 500.0,
            symbolLogo = "etherium"
        ),
        // Add 8 more similar instances for other cryptocurrencies
        CryptoModel(
            symbol = "Binance",
            shortSymbol = "BNB/USDT",
            price = 230.0,
            changePercent = 0.3,
            amountNumber = 0.7,
            amountDollar = 300000.0,
            sellPrice1 = 231.0, sellPrice2 = 232.0, sellPrice3 = 233.0, sellPrice4 = 234.0, sellPrice5 = 235.0,
            sellAmount1 = 10.0, sellAmount2 = 12.0, sellAmount3 = 11.5, sellAmount4 = 10.8, sellAmount5 = 9.6,
            buyPrice1 = 229.0, buyPrice2 = 228.0, buyPrice3 = 227.0, buyPrice4 = 226.0, buyPrice5 = 225.0,
            buyAmount1 = 10.3, buyAmount2 = 12.5, buyAmount3 = 11.2, buyAmount4 = 9.8, buyAmount5 = 10.6,
            open = 229.0, close = 230.0, high = 235.0, low = 228.0,
            dailyChange = 1.0, dailyVol = 120.0,
            symbolLogo = "binance"
        ),
        CryptoModel(
            symbol = "Ripple",
            shortSymbol = "XRP/USDT",
            price = 0.48,
            changePercent = -1.2,
            amountNumber = 1.1,
            amountDollar = 120000.0,
            sellPrice1 = 0.49, sellPrice2 = 0.50, sellPrice3 = 0.51, sellPrice4 = 0.52, sellPrice5 = 0.53,
            sellAmount1 = 5000.0, sellAmount2 = 4500.0, sellAmount3 = 4000.0, sellAmount4 = 3500.0, sellAmount5 = 3000.0,
            buyPrice1 = 0.47, buyPrice2 = 0.46, buyPrice3 = 0.45, buyPrice4 = 0.44, buyPrice5 = 0.43,
            buyAmount1 = 6000.0, buyAmount2 = 5500.0, buyAmount3 = 5000.0, buyAmount4 = 4500.0, buyAmount5 = 4000.0,
            open = 0.50, close = 0.48, high = 0.51, low = 0.47,
            dailyChange = -0.02, dailyVol = 20000.0,
            symbolLogo = "ripple"
        ),
        CryptoModel(
            symbol = "Doge",
            shortSymbol = "DOGE/USDT",
            price = 0.07,
            changePercent = 0.5,
            amountNumber = 0.9,
            amountDollar = 90000.0,
            sellPrice1 = 0.071, sellPrice2 = 0.072, sellPrice3 = 0.073, sellPrice4 = 0.074, sellPrice5 = 0.075,
            sellAmount1 = 8000.0, sellAmount2 = 8500.0, sellAmount3 = 9000.0, sellAmount4 = 9500.0, sellAmount5 = 10000.0,
            buyPrice1 = 0.069, buyPrice2 = 0.068, buyPrice3 = 0.067, buyPrice4 = 0.066, buyPrice5 = 0.065,
            buyAmount1 = 7500.0, buyAmount2 = 7000.0, buyAmount3 = 6500.0, buyAmount4 = 6000.0, buyAmount5 = 5500.0,
            open = 0.07, close = 0.07, high = 0.075, low = 0.065,
            dailyChange = 0.002, dailyVol = 15000.0,
            symbolLogo = "doge"
        ),
        CryptoModel(
            symbol = "Solana",
            shortSymbol = "SOL/USDT",
            price = 24.5,
            changePercent = 2.3,
            amountNumber = 1.2,
            amountDollar = 700000.0,
            sellPrice1 = 24.6, sellPrice2 = 24.7, sellPrice3 = 24.8, sellPrice4 = 24.9, sellPrice5 = 25.0,
            sellAmount1 = 100.0, sellAmount2 = 110.0, sellAmount3 = 120.0, sellAmount4 = 130.0, sellAmount5 = 140.0,
            buyPrice1 = 24.4, buyPrice2 = 24.3, buyPrice3 = 24.2, buyPrice4 = 24.1, buyPrice5 = 24.0,
            buyAmount1 = 150.0, buyAmount2 = 140.0, buyAmount3 = 130.0, buyAmount4 = 120.0, buyAmount5 = 110.0,
            open = 24.0, close = 24.5, high = 25.0, low = 23.8,
            dailyChange = 0.5, dailyVol = 450.0,
            symbolLogo = "solana"
        ),
        CryptoModel(
            symbol = "Cardino",
            shortSymbol = "ADA/USDT",
            price = 0.32,
            changePercent = -0.8,
            amountNumber = 0.5,
            amountDollar = 50000.0,
            sellPrice1 = 0.33, sellPrice2 = 0.34, sellPrice3 = 0.35, sellPrice4 = 0.36, sellPrice5 = 0.37,
            sellAmount1 = 3000.0, sellAmount2 = 3500.0, sellAmount3 = 4000.0, sellAmount4 = 4500.0, sellAmount5 = 5000.0,
            buyPrice1 = 0.31, buyPrice2 = 0.30, buyPrice3 = 0.29, buyPrice4 = 0.28, buyPrice5 = 0.27,
            buyAmount1 = 4000.0, buyAmount2 = 4500.0, buyAmount3 = 5000.0, buyAmount4 = 5500.0, buyAmount5 = 6000.0,
            open = 0.33, close = 0.32, high = 0.34, low = 0.31,
            dailyChange = -0.01, dailyVol = 2500.0,
            symbolLogo = "cardino"
        ),
        CryptoModel(
            symbol = "Matic",
            shortSymbol = "MATIC/USDT",
            price = 0.89,
            changePercent = 1.1,
            amountNumber = 0.4,
            amountDollar = 30000.0,
            sellPrice1 = 0.90, sellPrice2 = 0.91, sellPrice3 = 0.92, sellPrice4 = 0.93, sellPrice5 = 0.94,
            sellAmount1 = 2000.0, sellAmount2 = 2500.0, sellAmount3 = 3000.0, sellAmount4 = 3500.0, sellAmount5 = 4000.0,
            buyPrice1 = 0.88, buyPrice2 = 0.87, buyPrice3 = 0.86, buyPrice4 = 0.85, buyPrice5 = 0.84,
            buyAmount1 = 2200.0, buyAmount2 = 2700.0, buyAmount3 = 3200.0, buyAmount4 = 3700.0, buyAmount5 = 4200.0,
            open = 0.88, close = 0.89, high = 0.94, low = 0.85,
            dailyChange = 0.01, dailyVol = 1800.0,
            symbolLogo = "matic"
        )
    )
}