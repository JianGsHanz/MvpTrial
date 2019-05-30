package com.example.mvptrial

import android.app.Application

/**
 *Time:2019/5/30
 *Author:zyh
 *Description:
 */
class App : Application(){

    companion object{
        private var app : App? = null
        fun getInstance() = app
    }

    override fun onCreate() {
        super.onCreate()
        app = this
    }

}