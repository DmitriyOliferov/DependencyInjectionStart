package com.oliferov.dependencyinjectionstart.test2.data.datasource

import com.oliferov.dependencyinjectionstart.test2.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocaleDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
): ExampleLocaleDataSource {

    override fun method() {
        database.method()
    }
}