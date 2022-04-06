package com.oliferov.dependencyinjectionstart.test2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke(){
      repository.method()
    }
}