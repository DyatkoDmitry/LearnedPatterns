package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.transportCompanies

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.Automobile

class AutomobileTransportCompany(
    override val companyName: String = "Specific road transport company",
    override val maxCapacity: Long = 8000,
    override val maxSize: Long = 3100
) : Automobile()
