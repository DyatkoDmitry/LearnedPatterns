package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.railway.Gauge
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.railway.Track

abstract class Railway(
    val gauge: Gauge,
    val track: Track
) : Deliverer()
