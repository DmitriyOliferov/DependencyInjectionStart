package com.oliferov.dependencyinjectionstart.test2.data.network

import android.content.Context
import android.util.Log
import com.oliferov.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(private val context: Context) {

    fun method() {
        Log.i(LOG_TAG, "ExampleApiService ${context.resources.getString(R.string.app_name)}")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
