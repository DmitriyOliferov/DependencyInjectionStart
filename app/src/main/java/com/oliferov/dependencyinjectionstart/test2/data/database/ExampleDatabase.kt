package com.oliferov.dependencyinjectionstart.test2.data.database

import android.content.Context
import android.util.Log
import com.oliferov.dependencyinjectionstart.R
import com.oliferov.dependencyinjectionstart.test2.di.ApplicationScope
import javax.inject.Inject


class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
){

    fun method() {
        Log.i(
            LOG_TAG,
            "ExampleDatabase ${context.getString(R.string.app_name)} - $timeMillis - $this - $this"
        )
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
