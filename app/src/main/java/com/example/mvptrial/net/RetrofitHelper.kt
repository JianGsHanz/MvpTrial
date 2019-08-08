package com.example.mvptrial.net

/**
 *Time:2019/6/14
 *Author:zyh
 *Description: 代理类-可以配置多个BaseUrl(现转成dagger2注入)
 */
object RetrofitHelper {
    private var apiService : Any? = null
    private var apiServices : Any? = null

    fun getApiService() : AppApis {
        if (apiService == null) {
            apiService = AgentApi.getApiService(AppApis::class.java, Constans.BASE_URL)
        }
        return apiService as AppApis
    }

    fun getApiServiceOne() : AppApis {
        if (apiServices == null) {
            apiServices = AgentApi.getApiService(AppApis::class.java, Constans.BASE_URL_ONE)
        }
        return apiServices as AppApis
    }
}