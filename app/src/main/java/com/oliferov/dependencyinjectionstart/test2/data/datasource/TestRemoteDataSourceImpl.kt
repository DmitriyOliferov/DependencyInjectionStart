package com.oliferov.dependencyinjectionstart.test2.data.datasource

import android.util.Log
import com.oliferov.dependencyinjectionstart.test2.data.database.ExampleDatabase
import com.oliferov.dependencyinjectionstart.test2.data.network.ExampleApiService
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor(): ExampleRemoteDataSource {

    override fun method() {
        Log.i("TestRemoteDataSourceImpl","Test")
    }
}