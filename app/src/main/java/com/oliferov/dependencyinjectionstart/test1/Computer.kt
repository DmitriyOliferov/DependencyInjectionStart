package com.oliferov.dependencyinjectionstart.test1

import javax.inject.Inject

class Computer @Inject constructor (
    val monitor: Monitor,
    val mouse: Mouse,
    val keyboard: Keyboard,
    val computerTower: ComputerTower
)