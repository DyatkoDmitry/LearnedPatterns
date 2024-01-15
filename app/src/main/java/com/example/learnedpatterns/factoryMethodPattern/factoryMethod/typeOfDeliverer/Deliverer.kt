package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer

sealed class Deliverer{
    abstract val companyName: String
    abstract val maxCapacity: Long
    abstract val maxSize: Long
}
