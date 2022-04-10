package com.oliferov.dependencyinjectionstart.test2.di

import android.content.Context
import com.oliferov.dependencyinjectionstart.test2.presentation.MainActivity
import com.oliferov.dependencyinjectionstart.test2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationDataScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}