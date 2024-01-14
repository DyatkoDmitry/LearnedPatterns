package com.example.learnedpatterns.builderPattern.builder

interface Builder {
    fun setName(): Builder
    fun addCoffeeType():Builder
    fun addMilkType():Builder
    fun addSugarType():Builder
    fun addCinnamonType():Builder
    fun addSyrupType():Builder
    fun build(): CoffeDrink
}