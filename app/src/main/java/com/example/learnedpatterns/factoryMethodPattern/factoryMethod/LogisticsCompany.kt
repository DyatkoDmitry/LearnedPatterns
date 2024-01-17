package com.example.learnedpatterns.factoryMethodPattern.factoryMethod

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.Deliverer


abstract class LogisticsCompany {
    abstract fun getDeliverer(country: Country): Deliverer
}