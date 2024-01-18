package com.example.learnedpatterns.facadePattern.facade

class UserManager: UserManagerFacade {

    private val cacheManager = CacheManager()
    private val apiManager = ApiManager()

    override fun getUser(): User {

        var user = getUserFromCacheManager()

        if (user != null){
            return user
        }

        user = getUserFromApiManager()

        cacheManager.setUser(user)
        return user
    }

    private fun getUserFromApiManager(): User{
        return apiManager.getUser()
    }

    private fun  getUserFromCacheManager(): User?{
        return cacheManager.getUser()
    }
}