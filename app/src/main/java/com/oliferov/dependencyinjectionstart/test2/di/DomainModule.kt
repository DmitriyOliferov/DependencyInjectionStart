package com.oliferov.dependencyinjectionstart.test2.di

import com.oliferov.dependencyinjectionstart.test2.data.repository.ExampleRepositoryImpl
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}