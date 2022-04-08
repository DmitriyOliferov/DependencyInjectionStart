package com.oliferov.dependencyinjectionstart.test2.di

import android.content.Context
import com.oliferov.dependencyinjectionstart.test2.presentation.MainActivity
import com.oliferov.dependencyinjectionstart.test2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationDataScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

//    @Component.Builder
//    interface ApplicationComponentBuilder {
//
//        @BindsInstance
//        fun context(context: Context): ApplicationComponentBuilder
//
//        @BindsInstance
//        fun timeMillis(timeMillis: Long): ApplicationComponentBuilder
//
//        fun build(): ApplicationComponent
//    }

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}