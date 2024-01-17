package com.example.learnedpatterns.factoryMethodPattern

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.learnedpatterns.R
import com.example.learnedpatterns.databinding.ActivityFactoryMethodBinding
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.Country

class FactoryMethodActivity : AppCompatActivity() {

    private val viewModel: FactoryMethodViewModel by viewModels()
    private lateinit var binding: ActivityFactoryMethodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFactoryMethodBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setAllListeners()
    }

    private fun setAllListeners(){

        val radioGroupListener = object: RadioGroup.OnCheckedChangeListener {
            override fun onCheckedChanged(group: RadioGroup, checkedId: Int) {
                checkDelivererButtonVisibility()
            }
        }
        binding.radioGroup.setOnCheckedChangeListener(radioGroupListener)

        binding.getDelivererButton.setOnClickListener {
            val country = selectedCountry()

            //Invocation Fabric Method
            val deliverer = viewModel.getDeliverer(country)

            Toast.makeText(this, "You will be served by the ${deliverer.companyName}",Toast.LENGTH_SHORT).show()
        }
    }

    private fun checkDelivererButtonVisibility(){
        if(!binding.getDelivererButton.isVisible){
            binding.getDelivererButton.visibility = View.VISIBLE
        }
    }

    private fun selectedCountry(): Country{

        val selectedRadioButton = binding.radioGroup.checkedRadioButtonId

        if(selectedRadioButton == -1) throw Exception(" This function must invoke in DeliveredButtonListener")

        return when(selectedRadioButton){
            R.id.belarusRadioButton -> Country.BELARUS
            R.id.usaRadioButton -> Country.USA
            R.id.germanyRadioButton -> Country.GERMANY
            R.id.russiaRadioButton -> Country.RUSSIA
            else -> throw IllegalStateException("Invalid param value")
        }
    }
}