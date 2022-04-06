package com.oliferov.dependencyinjectionstart.test1

import dagger.Component

@Component
interface NewComponent {

    fun inject(activity: Activity)
}