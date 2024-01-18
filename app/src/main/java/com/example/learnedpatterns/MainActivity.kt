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

        binding.builderButton.setOnClickListener {
            val intentBuilder = Intent(this, BuilderActivity::class.java)
            startActivity(intentBuilder)
        }

        binding.singletonButton.setOnClickListener {
            val intentSingleton = Intent(this, SingletonActivity::class.java)
            startActivity(intentSingleton)
        }

        binding.factoryMethodButton.setOnClickListener {
            val intentFactoryMethod = Intent(this, FactoryMethodActivity::class.java)
            startActivity(intentFactoryMethod)
        }

        binding.facadeButton.setOnClickListener {
            val intentFacade = Intent(this, FacadeActivity::class.java)
            startActivity(intentFacade)
        }

        binding.observerButton.setOnClickListener {
            val intentObserver = Intent(this, ObserverActivity::class.java)
            startActivity(intentObserver)
        }
    }
}