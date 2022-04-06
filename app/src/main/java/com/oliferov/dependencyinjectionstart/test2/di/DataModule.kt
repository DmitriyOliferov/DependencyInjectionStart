package com.oliferov.dependencyinjectionstart.test2.di

import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleLocaleDataSource
import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleLocaleDataSourceImpl
import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleRemoteDataSource
import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module


@Module
interface DataModule {

    @Binds
    fun bindExampleLocaleDataSource(impl: ExampleLocaleDataSourceImpl): ExampleLocaleDataSource

    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}