package com.itoyx.forceofflineapp

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.forceOfflineBtn)

        btn.setOnClickListener {
            val intent = Intent("com.itoyx.forceofflineapp.FORCE_OFFLINE")
            sendBroadcast(intent)
        }


    }
}