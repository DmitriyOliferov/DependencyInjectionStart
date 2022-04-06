package com.oliferov.dependencyinjectionstart.test2.di

import com.oliferov.dependencyinjectionstart.test2.data.repository.ExampleRepositoryImpl
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}