package com.example.learnedpatterns.observerPattern

import com.example.learnedpatterns.observerPattern.interfaces.Observer
import com.example.learnedpatterns.observerPattern.interfaces.Subject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object WeatherObserver: Subject {

    private val observers: MutableList<Observer> = mutableListOf()

    private val CONVERSATION_BASIS = 1000
    private val TIME_REFRESH: Long = 5000

    var weatherValue:Long
    init {
        weatherValue = getCurrentWeatherValue()

        CoroutineScope((Job() + Dispatchers.Main)).apply {
            launch {
                while (true){
                    delay(TIME_REFRESH)
                    weatherValue =  getCurrentWeatherValue()
                    notifyObservers()
                }
            }
        }
    }

    private fun getCurrentWeatherValue(): Long{

        // Similar formula from the task: Int(Date.timeIntervalSinceReferenceDate) % 35
        return (System.currentTimeMillis() / CONVERSATION_BASIS) % 35
    }

    override fun registerObserver(observer: Observer) {
        if(observers.contains(observer)) return
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        if(observers.contains(observer)){
            observers.remove(observer)
        }
    }

    override fun notifyObservers() {
       for(observer in observers){
           observer.update(weatherValue.toString())
       }
    }

    fun getObservers(): List<Observer>{
        return observers
    }

    fun clearAllObservers(){
        observers.clear()
    }
}