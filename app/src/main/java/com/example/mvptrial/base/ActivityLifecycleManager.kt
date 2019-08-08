package com.example.mvptrial.base

import android.app.Activity
import android.app.Application
import android.os.Bundle

/**
 *Time:2019/8/8
 *Author:zyh
 *Description:
 */
class ActivityLifecycleManager :Application.ActivityLifecycleCallbacks{

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
    }

    override fun onActivityStarted(activity: Activity?) {
    }
    override fun onActivityResumed(activity: Activity?) {

    }
    override fun onActivityPaused(activity: Activity?) {

    }
    override fun onActivityStopped(activity: Activity?) {
    }
    override fun onActivityDestroyed(activity: Activity?) {
    }

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
    }





}