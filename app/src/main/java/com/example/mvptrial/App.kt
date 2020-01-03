package com.example.mvptrial

import android.app.Activity
import android.app.Application
import android.content.Context
import com.example.mvptrial.di.commponent.*
import com.example.mvptrial.di.module.ActivityModule
import com.example.mvptrial.di.module.ApiModule
import com.example.mvptrial.di.module.AppModule
import kotlin.properties.Delegates

/**
 *Time:2019/5/30
 *Author:zyh
 *Description:
 */
class App : Application() {

    companion object {
        var app: App by Delegates.notNull()
    }

    lateinit var appCommponent: AppCommponent

    override fun onCreate() {
        super.onCreate()
        app = this

        appCommponent = DaggerAppCommponent.builder().appModule(AppModule(this)).build()
    }

    fun getApiCommponent(context: Context): ApiCommponent =
        DaggerApiCommponent.builder().appCommponent(appCommponent).apiModule(ApiModule(context)).build()

    fun getActivityCommponent(activity: Activity): ActivityCommponent = DaggerActivityCommponent.builder()
        .apiCommponent(getApiCommponent(app.applicationContext))
        .activityModule(ActivityModule(activity)).build()
}