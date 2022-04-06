package com.oliferov.dependencyinjectionstart.test2.data.datasource

import com.oliferov.dependencyinjectionstart.test2.data.database.ExampleDatabase
import com.oliferov.dependencyinjectionstart.test2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
): ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}