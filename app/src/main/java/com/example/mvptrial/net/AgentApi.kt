package com.example.mvptrial.net

/**
 *Time:2019/6/14
 *Author:zyh
 *Description:
 */
object AgentApi {

    fun <T> getApiService(cls: Class<T>, baseUrl: String): T {
        val retrofit = RetrofitUtil.initRetrofit(baseUrl)
        return retrofit.create(cls)
    }
}