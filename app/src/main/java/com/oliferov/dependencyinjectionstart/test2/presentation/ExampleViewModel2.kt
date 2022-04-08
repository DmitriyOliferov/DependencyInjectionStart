package com.oliferov.dependencyinjectionstart.test2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleRepository
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {

    fun method() {
        repository.method()
        Log.i("ExampleViewModel2","$this")
    }
}