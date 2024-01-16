package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.transportCompanies

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.Railway
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.railway.Gauge
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.railway.Track

class RailwayTransportCompany(
    override val companyName: String = "Specific railway transport company",
    override val maxCapacity: Long = 36000,
    override val maxSize: Long = 20000,
    gauge: Gauge = Gauge.STANDARD,
    track: Track = Track.BALLASTED
) : Railway(gauge, track)