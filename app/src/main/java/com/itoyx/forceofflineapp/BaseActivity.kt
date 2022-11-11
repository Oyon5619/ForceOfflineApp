package com.itoyx.forceofflineapp

import android.content.IntentFilter
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity: AppCompatActivity() {
    private lateinit var receiver: ForceOfflineReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityController.addAct(this@BaseActivity)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityController.rmvAct(this@BaseActivity)
    }

    override fun onResume() {
        super.onResume()
        val intentFilter = IntentFilter()
        intentFilter.addAction("com.itoyx.forceofflineapp.FORCE_OFFLINE")
        receiver = ForceOfflineReceiver()
        registerReceiver(receiver, intentFilter)
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(receiver)
    }
}