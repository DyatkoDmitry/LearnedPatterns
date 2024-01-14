package com.example.learnedpatterns.builderPattern.builder

class Director() {

    fun makeCofee(builder: Builder):CoffeDrink{
        return builder.setName().addCoffeeType().addMilkType().addSugarType().addCinnamonType().addSyrupType().build()
    }
}