package com.example.mvptrial.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *Time:2019/8/7
 *Author:zyh
 *Description:
 */
@Module
class AppModule(private val context: Context) {
    @Singleton
    @Provides
    fun provideContext(): Context = this.context
}