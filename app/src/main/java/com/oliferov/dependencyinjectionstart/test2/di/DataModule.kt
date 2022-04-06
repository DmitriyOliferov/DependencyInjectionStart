package com.oliferov.dependencyinjectionstart.test2.di

import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleLocaleDataSource
import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleLocaleDataSourceImpl
import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleRemoteDataSource
import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun providerExampleLocaleDataSource(impl: ExampleLocaleDataSourceImpl): ExampleLocaleDataSource {
        return impl
    }

    @Provides
    fun providerExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource{
        return impl
    }
}