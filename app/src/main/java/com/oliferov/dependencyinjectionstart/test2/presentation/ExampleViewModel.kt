package com.oliferov.dependencyinjectionstart.test2.presentation

import com.oliferov.dependencyinjectionstart.test2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}