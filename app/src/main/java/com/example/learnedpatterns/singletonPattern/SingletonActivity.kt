package com.example.learnedpatterns.singletonPattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.learnedpatterns.databinding.ActivitySingletonBinding

class SingletonActivity : AppCompatActivity() {

    private val viewModel: SingletonViewModel by viewModels()
    private lateinit var binding: ActivitySingletonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySingletonBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setAllListeners()
    }

    private fun setAllListeners(){

        binding.kotlinSingletonButton.setOnClickListener {
            viewModel.createKotlinSingleton()
        }

        binding.javaSingletonButton.setOnClickListener {
            viewModel.createJavaSingleton()
        }

        viewModel.kotlinSingleton.observe(this, Observer {
            Toast.makeText(this, "${it.name} ready, hashCode = ${it.hashCode()}", Toast.LENGTH_SHORT).show()
        })

        viewModel.javaSingleton.observe(this, Observer {
            Toast.makeText(this, "${it.name} ready, hashCode = ${it.hashCode()}", Toast.LENGTH_SHORT).show()
        })
    }
}