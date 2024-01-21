package com.example.learnedpatterns.observerPattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnedpatterns.R
import com.example.learnedpatterns.databinding.ActivityObserverBinding
import com.example.learnedpatterns.observerPattern.interfaces.ScreenManager
import java.lang.StringBuilder

class ObserverActivity : AppCompatActivity(), ScreenManager {

    private lateinit var binding: ActivityObserverBinding
    private val myFragmentManager = MyFragmentManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityObserverBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toFirstScreen()
    }

    override fun toFirstScreen() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, myFragmentManager.fragment1, null)
            .addToBackStack(null)
            .commit()
    }

    override fun toSecondScreen(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, myFragmentManager.fragment2, null)
            .addToBackStack(null)
            .commit()
    }

    override fun toThirdScreen() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, myFragmentManager.fragment3, null)
            .addToBackStack(null)
            .commit()
    }

    override fun notifyVisibleObserversNames() {
        binding.observersTextView.text = getObserversNames()
    }

    private fun getObserversNames(): StringBuilder{

        val listNames = StringBuilder()
        for (observer in WeatherObserver.getObservers()){
            listNames.append(observer.javaClass.simpleName).append(" ")
        }
        return listNames
    }

    override fun onDestroy() {
        super.onDestroy()
        WeatherObserver.clearAllObservers()
    }
}