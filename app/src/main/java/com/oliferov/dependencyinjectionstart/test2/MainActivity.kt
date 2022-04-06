package com.oliferov.dependencyinjectionstart.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oliferov.dependencyinjectionstart.R
import com.oliferov.dependencyinjectionstart.test1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.keyboard.toString()
    }
}