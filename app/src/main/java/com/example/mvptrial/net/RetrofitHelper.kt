package com.example.mvptrial.net

import android.util.Log

/**
 *Time:2019/6/14
 *Author:zyh
 *Description:
 */
object RetrofitHelper {

//    fun getApiService() : AppApis =
//        AgentApi.getApiService(AppApis::class.java,Constans.BASE_URL)

    fun getApiService() : AppApis {
        val apiService = AgentApi.getApiService(AppApis::class.java, Constans.BASE_URL)
        println("apiService = $apiService")
        return apiService
    }
}