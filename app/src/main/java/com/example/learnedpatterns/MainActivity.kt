package com.example.learnedpatterns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnedpatterns.builderPattern.BuilderActivity
import com.example.learnedpatterns.databinding.ActivityMainBinding
import com.example.learnedpatterns.facadePattern.FacadeActivity
import com.example.learnedpatterns.factoryMethodPattern.FactoryMethodActivity
import com.example.learnedpatterns.observerPattern.ObserverActivity
import com.example.learnedpatterns.singletonPattern.SingletonActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setButtonsListeners()
    }

    private fun setButtonsListeners(){

        binding.builderButton.setOnClickListener {
            startActivityByClass(BuilderActivity::class.java)
        }

        binding.singletonButton.setOnClickListener {
            startActivityByClass(SingletonActivity::class.java)
        }

        binding.factoryMethodButton.setOnClickListener {
            startActivityByClass(FactoryMethodActivity::class.java)
        }

        binding.facadeButton.setOnClickListener {
            startActivityByClass(FacadeActivity::class.java)
        }

        binding.observerButton.setOnClickListener {
            startActivityByClass(ObserverActivity::class.java)
        }
    }

    private fun <T: Class<out AppCompatActivity>> startActivityByClass(activityClass: T){
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}