package com.example.learnedpatterns.facadePattern.facade

import kotlin.random.Random

class CacheManager {

    private var user: User?

    init {
        if(Random.nextBoolean()){
            user = User("Antonio","Anderson", dataSource = "CacheManager")
        } else{
            user = null
        }
    }

    fun getUser(): User?{
      return user
    }

    fun setUser(userFromApiManager: User){
        user = userFromApiManager
    }
}