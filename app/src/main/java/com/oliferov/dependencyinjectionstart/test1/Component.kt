package com.oliferov.dependencyinjectionstart.test1

class Component {

    private fun getComputer(): Computer {
        val monitor = Monitor()
        val mouse = Mouse()
        val keyboard = Keyboard()
        val computerTower = ComputerTower(
            Storage(),
            Memory(),
            Processor()
        )
        return Computer(
            monitor,
            mouse,
            keyboard,
            computerTower
        )
    }

    fun inject(activity: Activity){
        activity.computer = getComputer()
        activity.keyboard = Keyboard()
    }
}