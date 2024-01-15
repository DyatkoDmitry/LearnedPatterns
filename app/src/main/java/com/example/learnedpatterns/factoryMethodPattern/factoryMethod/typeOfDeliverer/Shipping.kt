package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer

class Shipping(
    override val companyName: String,
    override val maxCapacity: Long,
    override val maxSize: Long
) : Deliverer() {

}