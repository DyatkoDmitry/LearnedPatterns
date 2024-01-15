package com.example.learnedpatterns.factoryMethodPattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.learnedpatterns.databinding.ActivityFactoryMethodBinding


class FactoryMethodActivity : AppCompatActivity() {

    private val viewModel: FactoryMethodViewModel by viewModels()
    private lateinit var binding: ActivityFactoryMethodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFactoryMethodBinding.inflate(layoutInflater)

        setContentView(binding.root)


    }
}