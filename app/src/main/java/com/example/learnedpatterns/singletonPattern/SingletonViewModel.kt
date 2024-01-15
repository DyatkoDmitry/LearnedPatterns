package com.example.learnedpatterns.singletonPattern

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.learnedpatterns.singletonPattern.singleton.JavaSingleton
import com.example.learnedpatterns.singletonPattern.singleton.KotlinSingleton

class SingletonViewModel: ViewModel() {

    private val _kotlinSingleton = MutableLiveData<KotlinSingleton>()
    val kotlinSingleton: LiveData<KotlinSingleton> = _kotlinSingleton

    private val _javaSingleton = MutableLiveData<JavaSingleton>()
    val javaSingleton: LiveData<JavaSingleton> = _javaSingleton

    fun createKotlinSingleton(): KotlinSingleton{
        val sun = KotlinSingleton
        _kotlinSingleton.value = sun
        return sun
    }

    fun createJavaSingleton(): JavaSingleton{
        val sun = JavaSingleton.getInstance()
        _javaSingleton.value = sun
        return sun
    }
}