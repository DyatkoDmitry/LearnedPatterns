package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.aviation.Mode
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.aviation.Traffic

abstract class Aviation(
    val mode: Mode,
    val traffic: Traffic
): Deliverer()