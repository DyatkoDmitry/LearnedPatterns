package com.example.learnedpatterns.factoryMethodPattern.factoryMethod

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.Deliverer


abstract class LogisticCompany {
    abstract fun getDeliverer(country: String): Deliverer
}