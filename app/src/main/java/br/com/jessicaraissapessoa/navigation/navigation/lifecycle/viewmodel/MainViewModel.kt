package br.com.jessicaraissapessoa.navigation.navigation.lifecycle.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _counter = NumberLiveData()
    val counter : LiveData<Int> = _counter

    fun increment() {
        val number = _counter.value ?: 0
        _counter.value = number + 1
    }
}

class NumberLiveData(initial : Int = 0) : MutableLiveData<Int>(initial) { //Personalização de LiveData

    override fun onActive() {
        super.onActive()
        Log.d("MainViewModel", "onActive")
    }

    override fun onInactive() {
        super.onInactive()
        Log.d("MainViewModel", "onInactive")
    }
}