package com.oliferov.dependencyinjectionstart.test2.data.network

import android.content.Context
import android.util.Log
import com.oliferov.dependencyinjectionstart.R
import com.oliferov.dependencyinjectionstart.test2.di.ApplicationScope
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.i(
            LOG_TAG,
            "ExampleApiService ${context.resources.getString(R.string.app_name)} - $timeMillis - $this"
        )
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
