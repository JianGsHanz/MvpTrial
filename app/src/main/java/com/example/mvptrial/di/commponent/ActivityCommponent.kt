package com.example.mvptrial.di.commponent

import com.example.mvptrial.di.module.ActivityModule
import com.example.mvptrial.di.scope.PerActivity
import com.example.mvptrial.ui.main.MainActivity
import com.example.mvptrial.ui.splash.SplashActivity
import dagger.Component

/**
 *Time:2019/8/7
 *Author:zyh
 *Description:
 */
@PerActivity
@Component(dependencies = [ApiCommponent::class],modules = [ActivityModule::class])
interface ActivityCommponent {
    fun inject(splashActivity: SplashActivity)
    fun inject(mainActivity: MainActivity)
}