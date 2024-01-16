package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.transportCompanies

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.Aviation
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.aviation.Mode
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.aviation.Traffic
import kotlin.math.max

class AviationTransportCompany(
    override val companyName: String = "Specific aviation transport company",
    override val maxCapacity: Long = 561,
    override val maxSize: Long = 350,
    mode: Mode = Mode.FREIGHT,
    traffic: Traffic = Traffic.INTERCITY
) : Aviation (mode, traffic)