package com.example.mvptrial.di.module

import android.content.Context
import com.example.mvptrial.di.scope.PerApi
import com.example.mvptrial.net.AppApis
import com.example.mvptrial.net.Constans
import com.example.mvptrial.net.RetrofitUtil
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

/**
 *Time:2019/8/7
 *Author:zyh
 *Description:
 */
@Module
class ApiModule(private val context: Context) {

    @Named("Apis")
    @PerApi
    @Provides
    fun provideRetrofit(): Retrofit
            = RetrofitUtil.initRetrofit(Constans.BASE_URL_ONE)

    @PerApi
    @Provides
    fun provideAppApis(@Named("Apis")retrofit: Retrofit): AppApis
            = retrofit.create(AppApis::class.java)

    @PerApi
    @Provides
    fun provideContext(): Context = this.context
}