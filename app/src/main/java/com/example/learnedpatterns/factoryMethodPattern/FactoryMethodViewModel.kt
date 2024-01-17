package com.example.learnedpatterns.factoryMethodPattern

import androidx.lifecycle.ViewModel
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.Country
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.SpecificLogisticsCompany
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.Deliverer

class FactoryMethodViewModel: ViewModel() {

    private val specificLogisticsCompany: SpecificLogisticsCompany by lazy { SpecificLogisticsCompany() }

    //Fabric Method
    fun getDeliverer(country: Country): Deliverer {
          return specificLogisticsCompany.getDeliverer(country)
    }
}