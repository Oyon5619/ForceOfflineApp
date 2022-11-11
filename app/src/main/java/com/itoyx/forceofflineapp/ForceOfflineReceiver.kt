package com.itoyx.forceofflineapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AlertDialog

class ForceOfflineReceiver: BroadcastReceiver() {
    override fun onReceive(p0: Context, p1: Intent) {
        AlertDialog.Builder(p0).apply {
            setTitle("warning")
            setMessage("you are forced to be offline...")
            setCancelable(false)
            setPositiveButton("OK") { _,_ ->
                ActivityController.finishAll()
                val i = Intent(p0, LoginActivity::class.java)
                p0.startActivity(i)
            }
            show()
        }
    }
}