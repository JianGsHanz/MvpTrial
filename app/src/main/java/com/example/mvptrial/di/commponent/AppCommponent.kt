package com.example.mvptrial.di.commponent

import com.example.mvptrial.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 *Time:2019/8/7
 *Author:zyh
 *Description:
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppCommponent {
}