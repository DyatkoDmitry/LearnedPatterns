package com.example.learnedpatterns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnedpatterns.builderPattern.BuilderActivity
import com.example.learnedpatterns.databinding.ActivityMainBinding
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

    }
}