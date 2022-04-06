package com.oliferov.dependencyinjectionstart.test2.presentation

import com.oliferov.dependencyinjectionstart.test2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}