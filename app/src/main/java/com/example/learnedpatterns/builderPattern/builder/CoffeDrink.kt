package com.example.learnedpatterns.builderPattern.builder

import com.example.learnedpatterns.builderPattern.builder.ingredients.CinnamonType
import com.example.learnedpatterns.builderPattern.builder.ingredients.CoffeeType
import com.example.learnedpatterns.builderPattern.builder.ingredients.MilkType
import com.example.learnedpatterns.builderPattern.builder.ingredients.SugarType
import com.example.learnedpatterns.builderPattern.builder.ingredients.SyrupType

class CoffeDrink(
    val name: String?,
    val coffeeType: CoffeeType?,
    val milkType: MilkType?,
    val sugarType: SugarType?,
    val cinnamonType: CinnamonType?,
    val syrupType: SyrupType?
){
    init {
        if( name == null && coffeeType == null ) throw Exception("CoffeeDrink field must be initialised")
    }
}