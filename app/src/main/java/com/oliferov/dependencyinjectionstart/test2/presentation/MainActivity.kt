package com.oliferov.dependencyinjectionstart.test2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oliferov.dependencyinjectionstart.R
import com.oliferov.dependencyinjectionstart.test2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel
    private val component by lazy {
        DaggerApplicationComponent.builder()
            .context(application)
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()

    }
}