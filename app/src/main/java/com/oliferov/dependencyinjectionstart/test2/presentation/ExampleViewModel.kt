package com.oliferov.dependencyinjectionstart.test2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
): ViewModel() {

    fun method() {
        useCase()
        Log.i("ExampleViewModel","$this")
    }
}