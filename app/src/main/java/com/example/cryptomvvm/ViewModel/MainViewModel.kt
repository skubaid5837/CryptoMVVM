package com.example.cryptomvvm.ViewModel

import androidx.lifecycle.ViewModel
import com.example.cryptomvvm.Repository.MainRepository

class MainViewModel(val repository: MainRepository):ViewModel() {

    constructor():this(MainRepository())

    fun loadData() = repository.items

}