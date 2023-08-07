package com.myproject.travelapp_m3_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myproject.travelapp_m3_mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
    }
}