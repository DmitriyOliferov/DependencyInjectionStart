package com.oliferov.dependencyinjectionstart.test2.data.datasource

import com.oliferov.dependencyinjectionstart.test2.data.database.ExampleDatabase
import com.oliferov.dependencyinjectionstart.test2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
): ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}