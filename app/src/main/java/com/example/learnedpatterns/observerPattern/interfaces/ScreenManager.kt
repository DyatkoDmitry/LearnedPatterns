package com.example.learnedpatterns.observerPattern.interfaces

interface ScreenManager {
    fun toFirstScreen()
    fun toSecondScreen()
    fun toThirdScreen()
    fun notifyVisibleObserversNames()
}