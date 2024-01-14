package com.example.learnedpatterns.builderPattern.builder.concreteBuilders

import com.example.learnedpatterns.builderPattern.builder.Builder
import com.example.learnedpatterns.builderPattern.builder.CoffeDrink
import com.example.learnedpatterns.builderPattern.builder.ingredients.CinnamonType
import com.example.learnedpatterns.builderPattern.builder.ingredients.CoffeeType
import com.example.learnedpatterns.builderPattern.builder.ingredients.MilkType
import com.example.learnedpatterns.builderPattern.builder.ingredients.SugarType
import com.example.learnedpatterns.builderPattern.builder.ingredients.SyrupType

class MoccoBuilder: Builder {

    private var name: String? = null
    private var coffeeType: CoffeeType? = null
    private var milkType: MilkType? = null
    private var sugarType: SugarType? = null
    private var cinnamonType: CinnamonType? = null
    private var syrupType: SyrupType? = null

    override fun setName(): Builder {
        name = "Mocco"
        return this
    }

    override fun addCoffeeType(): Builder {
        coffeeType = CoffeeType.COFFEE
        return this
    }

    override fun addMilkType(): Builder {
        milkType = MilkType.CREAM
        return this
    }

    override fun addSugarType(): Builder {
        sugarType = SugarType.NONE
        return this
    }

    override fun addCinnamonType(): Builder {
        cinnamonType = CinnamonType.NONE
        return this
    }

    override fun addSyrupType(): Builder {
        syrupType = SyrupType.CHOCALATE
        return this
    }

    override fun build(): CoffeDrink {
        return CoffeDrink(name, coffeeType,milkType, sugarType,cinnamonType,syrupType)
    }
}