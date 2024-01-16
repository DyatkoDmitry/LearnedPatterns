package com.example.learnedpatterns.factoryMethodPattern.factoryMethod.transportCompanies

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.Shipping
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.shipping.TypeOfShipping

class ShippingTransportCompany(
    override val companyName: String = "Specific shipping transport company",
    override val maxCapacity: Long = 6500,
    override val maxSize: Long = 478,
    typeOfShipping: TypeOfShipping = TypeOfShipping.SEA
) : Shipping(typeOfShipping)