package com.example.learnedpatterns.observerPattern.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.learnedpatterns.databinding.Fragment2Binding
import com.example.learnedpatterns.observerPattern.WeatherObserver
import com.example.learnedpatterns.observerPattern.interfaces.Observer
import com.example.learnedpatterns.observerPattern.interfaces.ScreenManager

class Fragment2 : Fragment(), Observer {

    private var binding: Fragment2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment2Binding.inflate(inflater, container, false)
        return binding!!.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.WeatherValue.text = WeatherObserver.weatherValue.toString()

        binding!!.toFirstScreenbutton.setOnClickListener {
            (activity as ScreenManager).toFirstScreen()
            notifyVisibleObserversNames()
        }

        binding!!.toThirdScreenbutton.setOnClickListener {
            (activity as ScreenManager).toThirdScreen()
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
            binding!!.WeatherValue.text = weatherValue
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