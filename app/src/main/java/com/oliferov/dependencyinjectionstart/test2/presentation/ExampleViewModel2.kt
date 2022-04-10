package com.oliferov.dependencyinjectionstart.test2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.oliferov.dependencyinjectionstart.test2.di.IdQualifier
import com.oliferov.dependencyinjectionstart.test2.di.NameQualifier
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleRepository
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
): ViewModel() {

    fun method() {
        repository.method()
        Log.i("ExampleViewModel2","$this $id $name")
    }
}