package com.example.learnedpatterns.observerPattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.learnedpatterns.R
import com.example.learnedpatterns.databinding.ActivityObserverBinding

class ObserverActivity : AppCompatActivity() {

    private lateinit var binding: ActivityObserverBinding
    private val viewModel: ObserverViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityObserverBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}