package com.example.mvptrial.net

import android.util.Log

/**
 *Time:2019/6/14
 *Author:zyh
 *Description: 代理类-可以配置多个BaseUrl
 */
object RetrofitHelper {
    private var apiService : Any? = null
    private var apiServices : Any? = null

    fun getApiService() : AppApis {
        if (apiService == null) {
            apiService = AgentApi.getApiService(AppApis::class.java, Constans.BASE_URL)
        }
        println("apiService = $apiService")
        return apiService as AppApis
    }

    fun getApiServiceOne() : AppApis {
        if (apiServices == null) {
            apiServices = AgentApi.getApiService(AppApis::class.java, Constans.BASE_URL_ONE)
        }
        println("apiService = $apiServices")
        return apiServices as AppApis
    }
}