package com.oliferov.dependencyinjectionstart.test1

class Activity {


    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}