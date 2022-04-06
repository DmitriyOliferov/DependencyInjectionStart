package com.oliferov.dependencyinjectionstart.test2.data.repository

import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleLocaleDataSource
import com.oliferov.dependencyinjectionstart.test2.data.mapper.ExampleMapper
import com.oliferov.dependencyinjectionstart.test2.data.datasource.ExampleRemoteDataSource
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localeDataSource: ExampleLocaleDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
): ExampleRepository {

    override fun method() {
        mapper.map()
        localeDataSource.method()
        remoteDataSource.method()
    }
}