package com.oliferov.dependencyinjectionstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}