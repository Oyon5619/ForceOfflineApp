package com.itoyx.forceofflineapp

import android.app.Activity
import android.util.Log

object ActivityController {
    private val acts = ArrayList<Activity>()

    fun addAct(activity: Activity) {
        acts.add(activity)
    }

    fun rmvAct(activity: Activity) {
        acts.remove(activity)
    }

    fun finishAll() {
        for(act in acts) {
            if(!act.isFinishing) {
                Log.d("ActivityController", "Forcing finish $act")
                act.finish()
            }
        }
        acts.clear()
    }
}