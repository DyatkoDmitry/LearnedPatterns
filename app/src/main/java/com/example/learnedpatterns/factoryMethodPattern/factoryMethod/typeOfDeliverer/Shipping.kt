package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.shipping.TypeOfShipping

abstract class Shipping(
    val typeOfShipping: TypeOfShipping
) : Deliverer()