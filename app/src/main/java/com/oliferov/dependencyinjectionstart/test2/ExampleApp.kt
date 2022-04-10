package com.oliferov.dependencyinjectionstart.test2

import android.app.Application
import com.oliferov.dependencyinjectionstart.test2.di.DaggerApplicationComponent

class ExampleApp: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this,System.currentTimeMillis())
    }
}