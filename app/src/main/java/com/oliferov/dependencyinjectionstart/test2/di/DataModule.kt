package com.oliferov.dependencyinjectionstart.test2.di

import com.oliferov.dependencyinjectionstart.test2.data.datasource.*
import dagger.Binds
import dagger.Module


@Module
interface DataModule {

    @ApplicationDataScope
    @Binds
    fun bindExampleLocaleDataSource(impl: ExampleLocaleDataSourceImpl): ExampleLocaleDataSource

    @ApplicationDataScope

    @Binds @ProdQualifier
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @Binds @TestQualifier
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}