package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.transportCompanies

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.Aviation
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.aviation.Mode
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.aviation.Traffic

class AviationTransportCompany1(
    override val companyName: String = "Aviation transport company 1",
    override val maxCapacity: Long = 561,
    override val maxSize: Long = 350,
    traffic: Traffic = Traffic.INTERCITY,
    mode: Mode = Mode.FREIGHT
) : Aviation(traffic, mode)