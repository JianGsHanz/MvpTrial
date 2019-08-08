package com.example.mvptrial.di.module

import android.app.Activity
import com.example.mvptrial.di.scope.PerActivity
import dagger.Module
import dagger.Provides

/**
 *Time:2019/8/7
 *Author:zyh
 *Description:
 */
@Module
class ActivityModule(private val activity: Activity) {
    @PerActivity
    @Provides
    fun getActivity():Activity = activity
}