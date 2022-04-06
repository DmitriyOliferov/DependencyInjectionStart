package com.oliferov.dependencyinjectionstart.test1

import javax.inject.Inject

class Activity {
    val component = DaggerNewComponent.create()
    @Inject
    lateinit var keyboard: Keyboard
    //    = component.getKeyboard()
    @Inject
    lateinit var mouse: Mouse

    //    = component.getMouse()
    @Inject
    lateinit var monitor: Monitor
//    = component.getMonitor()

    init {
        DaggerNewComponent.create().inject(this)
    }
}