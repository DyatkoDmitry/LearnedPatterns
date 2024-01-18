package com.example.learnedpatterns.facadePattern

import androidx.lifecycle.ViewModel
import com.example.learnedpatterns.facadePattern.facade.User
import com.example.learnedpatterns.facadePattern.facade.UserManager

class FacadeViewModel:ViewModel() {

    private val userManager = UserManager()

    fun getUser(): User {
        return userManager.getUser()
    }

}