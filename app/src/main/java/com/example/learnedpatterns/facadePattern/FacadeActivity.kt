package com.example.learnedpatterns.facadePattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.learnedpatterns.R
import com.example.learnedpatterns.databinding.ActivityFacadeBinding

class FacadeActivity : AppCompatActivity() {

    private val viewModel:FacadeViewModel by viewModels()
    private lateinit var binding: ActivityFacadeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFacadeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}