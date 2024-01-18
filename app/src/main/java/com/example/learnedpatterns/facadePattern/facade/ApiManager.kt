package com.example.learnedpatterns.facadePattern.facade

class ApiManager {

    private val user = User("Dan","Baker", "ApiManager")

    fun getUser(): User{
        return user
    }
}