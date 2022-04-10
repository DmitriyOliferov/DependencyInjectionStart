package com.oliferov.dependencyinjectionstart.test2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.oliferov.dependencyinjectionstart.test2.di.IdQualifier
import com.oliferov.dependencyinjectionstart.test2.di.NameQualifier
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
): ViewModel() {

    fun method() {
        useCase()
        Log.i("ExampleViewModel","$this $id $name")
    }
}