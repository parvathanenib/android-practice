package com.androidpractice.heloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
    }
}