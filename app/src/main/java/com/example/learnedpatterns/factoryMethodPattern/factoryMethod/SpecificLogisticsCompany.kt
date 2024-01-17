package com.example.learnedpatterns.factoryMethodPattern.factoryMethod

import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.transportCompanies.AutomobileTransportCompany
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.transportCompanies.AviationTransportCompany
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.transportCompanies.RailwayTransportCompany
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.transportCompanies.ShippingTransportCompany
import com.example.learnedpatterns.factoryMethodPattern.factoryMethod.typeOfDeliverer.Deliverer

class SpecificLogisticsCompany: LogisticsCompany() {

    override fun getDeliverer(country: Country): Deliverer {
        return when(country) {
            Country.BELARUS -> AutomobileTransportCompany()
            Country.USA -> ShippingTransportCompany()
            Country.GERMANY -> AviationTransportCompany()
            Country.RUSSIA -> RailwayTransportCompany()
        }
    }
}