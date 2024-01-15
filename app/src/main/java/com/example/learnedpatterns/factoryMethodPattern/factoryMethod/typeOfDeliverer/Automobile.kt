package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer

class Automobile(
    override val companyName: String,
    override val maxCapacity: Long,
    override val maxSize: Long
) : Deliverer() {
}