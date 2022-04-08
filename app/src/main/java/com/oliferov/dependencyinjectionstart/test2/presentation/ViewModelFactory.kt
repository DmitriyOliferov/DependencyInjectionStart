package com.oliferov.dependencyinjectionstart.test2.presentation

import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.oliferov.dependencyinjectionstart.test2.domain.ExampleUseCase
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val exampleUseCase: ExampleUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass == ExampleViewModel::class.java) {
            return ExampleViewModel(exampleUseCase) as T
        }
    throw RuntimeException("Unknown view model class $modelClass")
    }
}