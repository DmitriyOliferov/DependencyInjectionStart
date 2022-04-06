package com.oliferov.dependencyinjectionstart.test2.data.datasource

import com.oliferov.dependencyinjectionstart.test2.data.database.ExampleDatabase

class ExampleLocaleDataSourceImpl(
    private val database: ExampleDatabase
): ExampleLocaleDataSource {

    override fun method() {
        database.method()
    }
}