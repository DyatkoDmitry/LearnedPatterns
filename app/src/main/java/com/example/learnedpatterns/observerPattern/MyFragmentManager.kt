package com.example.learnedpatterns.observerPattern

import com.example.learnedpatterns.observerPattern.fragments.Fragment1
import com.example.learnedpatterns.observerPattern.fragments.Fragment2
import com.example.learnedpatterns.observerPattern.fragments.Fragment3

class MyFragmentManager {

    val fragment1: Fragment1 by lazy{getSingleFragment1()}
    val fragment2: Fragment2 by lazy{getSingleFragment2()}
    val fragment3: Fragment3 by lazy{getSingleFragment3()}

    private fun getSingleFragment1(): Fragment1 {
        return Fragment1()
    }

    private fun getSingleFragment2(): Fragment2 {
        return Fragment2()
    }

    private fun getSingleFragment3(): Fragment3 {
        return Fragment3()
    }
}