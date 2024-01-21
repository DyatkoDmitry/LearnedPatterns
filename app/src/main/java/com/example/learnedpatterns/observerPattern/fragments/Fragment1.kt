package com.example.learnedpatterns.observerPattern.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.learnedpatterns.databinding.Fragment1Binding
import com.example.learnedpatterns.observerPattern.WeatherObserver
import com.example.learnedpatterns.observerPattern.interfaces.Observer
import com.example.learnedpatterns.observerPattern.interfaces.ScreenManager

class Fragment1 : Fragment(), Observer {

    private var binding: Fragment1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(inflater,container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.weatherValue.text = WeatherObserver.weatherValue.toString()

        binding!!.toSecondScreenbutton.setOnClickListener {
            (activity as ScreenManager).toSecondScreen()
            notifyVisibleObserversNames()
        }

        binding!!.closeImageButton.setOnClickListener {
            WeatherObserver.removeObserver(this)
            notifyVisibleObserversNames()
        }
    }

    override fun onStart() {
        super.onStart()
        WeatherObserver.registerObserver(this)
        notifyVisibleObserversNames()
    }

    override fun update(weatherValue: String) {
        if(binding != null){
            binding!!.weatherValue.text = weatherValue
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun notifyVisibleObserversNames(){
        (activity as ScreenManager).notifyVisibleObserversNames()
    }
}