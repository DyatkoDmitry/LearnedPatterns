package com.example.learnedpatterns.builderPattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.learnedpatterns.builderPattern.builder.concreteBuilders.BrownSugarBuilder
import com.example.learnedpatterns.builderPattern.builder.concreteBuilders.FlatWhiteBuilder
import com.example.learnedpatterns.builderPattern.builder.concreteBuilders.FrappeBuilder
import com.example.learnedpatterns.builderPattern.builder.concreteBuilders.MoccoBuilder
import com.example.learnedpatterns.databinding.ActivityBuilderBinding

class BuilderActivity : AppCompatActivity() {

    private val viewModel: BuilderViewModel by viewModels()
    private lateinit var binding:ActivityBuilderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBuilderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setALlListeners()

    }

    private fun setALlListeners(){

        binding.brownSugarButton.setOnClickListener {
            viewModel.makeCofee(BrownSugarBuilder())
        }

        binding.flatWhiteButton.setOnClickListener {
            viewModel.makeCofee(FlatWhiteBuilder())
        }

        binding.frappeButton.setOnClickListener {
            viewModel.makeCofee(FrappeBuilder())
        }

        binding.moccoButton.setOnClickListener {
            viewModel.makeCofee(MoccoBuilder())
        }

        viewModel.currentCoffeeDrink.observe(this, Observer {
            Toast.makeText(this, "${it.name} ready, hashCode = ${it.hashCode()}", Toast.LENGTH_SHORT).show()
        })
    }
}