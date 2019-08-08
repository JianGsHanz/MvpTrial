package com.example.mvptrial.di.commponent

import android.content.Context
import com.example.mvptrial.di.module.ApiModule
import com.example.mvptrial.di.scope.PerApi
import com.example.mvptrial.net.AppApis
import dagger.Component

/**
 *Time:2019/8/7
 *Author:zyh
 *Description:
 */
@PerApi
@Component(dependencies = [AppCommponent::class],modules = [ApiModule::class])
interface ApiCommponent {
    fun getAppApis():AppApis
    fun getContext():Context
}