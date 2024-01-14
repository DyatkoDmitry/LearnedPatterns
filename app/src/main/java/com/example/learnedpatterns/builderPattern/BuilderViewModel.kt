package com.example.learnedpatterns.builderPattern

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.learnedpatterns.builderPattern.builder.Builder
import com.example.learnedpatterns.builderPattern.builder.CoffeDrink
import com.example.learnedpatterns.builderPattern.builder.Director

class BuilderViewModel: ViewModel() {

    private val director:Director by lazy { Director() }

    private val _currentCoffeeDrink = MutableLiveData<CoffeDrink>()
    val currentCoffeeDrink:LiveData<CoffeDrink> = _currentCoffeeDrink

    fun makeCofee(builder: Builder): CoffeDrink{
        val coffeDrink = director.makeCofee(builder)

        _currentCoffeeDrink.value = coffeDrink

        return coffeDrink
    }
}